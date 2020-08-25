package com.example.demo.lambdaTest.base;

import com.example.demo.lambdaTest.enums.ExcelFailMark;
import com.example.demo.lambdaTest.enums.ExcelWriteBackMode;
import com.example.demo.lambdaTest.convert.ExcelCellConverter;
import com.example.demo.lambdaTest.result.CellConvertResult;
import com.example.demo.lambdaTest.result.RowConvertResult;
import com.example.demo.lambdaTest.result.SheetResolveResult;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:26
 * @description:
 */
@Data
@Accessors(chain = true)
public class SheetHandler<E> {

    /**
     * sheet页名称
     */
    private String name;

    /**
     * 列表元素对象类型
     */
    private Class<E> targetClass;

    /**
     * 表头
     */
    private String[] headers;

    /**
     * 列数据处理器 key: 属性名, value 处理器实现类
     */
    Map<String, ExcelCellConverter> converterMap;

    /**
     * 转换失败标识方式
     */
    private List<ExcelFailMark> failMarks;

    /**
     * 文件回写模式
     */
    private ExcelWriteBackMode writeBackMode;

    public SheetHandler(String name, Class<E> targetClass) {
        this.name = name;
        this.targetClass = targetClass;
    }

    /**
     * 添加列
     * <E> 为实体类型
     * <R> 为某个属性类型
     * @param field 列属性
     * @param converterClass 列数据转换器
     * @return
     */
    public <R> SheetHandler<E> appendCol(TypeFunction<E, R> field, Class<? extends ExcelCellConverter<R>> converterClass, boolean notNull){
        try {
            if (CollectionUtils.isEmpty(converterMap)){
                converterMap = new LinkedHashMap<>(16);
            }
            String fieldName = TypeFunction.getLambdaFieldName(field);
            if (converterClass != null){
                ExcelCellConverter<R> excelCellConverter = converterClass.newInstance();
                excelCellConverter.setNotNull(notNull);
                converterMap.put(fieldName, excelCellConverter);
            }else{
                converterMap.put(fieldName, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /**
     * 添加列【无需解析的场景使用】
     * @param field
     * <E> 为实体类型
     * <R> 为某个属性类型
     * @return
     */
    public <R> SheetHandler<E> appendCol(TypeFunction<E, R> field){
        return appendCol(field, null, false);
    }

    /**
     * 解析sheet数据
     * @param sheet
     * @return
     */
    public SheetResolveResult<E> resolve(XSSFSheet sheet){
        String sheetName = sheet.getSheetName();
        if (!StringUtils.equals(sheetName, name)){
            //TODO 文件模板错误
            throw new RuntimeException();
        }

        //工作表的表头
        Row row = sheet.getRow(0);
        //总列数
        int colLength = headers.length;

        //1.校验
        //1.1 配置校验
        if (colLength != converterMap.size()) {
            //TODO 总列数和转换器数量不一致，抛异常
            throw new RuntimeException();
        }
        //1.2表头文字校验
        for (int c = 0; c < colLength; c++) {
            String header = row.getCell(c).getStringCellValue();
            if (!StringUtils.equals(header, headers[c])) {
                //TODO 文件模板错误
                throw new RuntimeException();
            }
        }
        //2.真正开始处理sheet
        return processResolver(sheet);
    }


    /**
     * 解析处理Sheet数据核心流程方法
     * @param sheet 工作表对象
     * @return sheet数据解析结果
     */
    private SheetResolveResult<E> processResolver(XSSFSheet sheet){
        SheetResolveResult<E> result = new SheetResolveResult<>();
        List<RowConvertResult<E>> successList = new ArrayList<>();
        List<RowConvertResult<E>> failResults = new ArrayList<>();

        //总行数
        int rowLength = sheet.getLastRowNum() + 1;

        //每行
        for (int r = 1; r < rowLength; r++) {
            Row row = sheet.getRow(r);
            //校验整行单元格是否都为空，是则跳过
            if (allBlank(row)) {
                continue;
            }
            E targetInstance = null;
            try {
                targetInstance = targetClass.newInstance();
            } catch (Exception e) {
                //TODO 实例化目标对象失败
            }

            RowConvertResult<E> rowResult = new RowConvertResult<>(targetInstance, r);
            //整行转换成功标识
            boolean rowSuccess = true;
            int c = 0;
            //每个单元格
            for (Map.Entry<String, ExcelCellConverter> entry : converterMap.entrySet()) {
                String fieldName = entry.getKey();
                ExcelCellConverter cellConverter = entry.getValue();
                CellConvertResult cellResult = cellConverter.convert(row.getCell(c), headers[c]);
                rowResult.putCellResult(fieldName, cellResult);
                if (!cellResult.isSuccess()) {
                    //转换失败
                    rowSuccess = false;
                    rowResult.setPass(false);
                }else{
                    //转换成功
                    Field field;
                    try {
                        field = targetClass.getDeclaredField(entry.getKey());
                        //给目标对象属性赋值
                        field.setAccessible(true);
                        field.set(targetInstance, cellResult.getData());
                    } catch (Exception e) {
                        //TODO 获取对象属性失败
                        e.printStackTrace();
                        throw new RuntimeException();
                    }
                }
                c++;
            }
            if (rowSuccess){
                successList.add(rowResult);
            }else{
                failResults.add(rowResult);
            }
        }
        result.setSuccessResults(successList);
        result.setFailResults(failResults);
        return result;
    }

    /**
     * 整行单元格是否都为空
     *
     * @param row
     * @return
     */
    private boolean allBlank(Row row) {
        boolean allBlank = true;
        int colLength = headers.length;
        for (int c = 0; c < colLength; c++) {
            if (StringUtils.isNotBlank(row.getCell(c).getStringCellValue())) {
                allBlank = false;
                break;
            }
        }
        return allBlank;
    }
}
