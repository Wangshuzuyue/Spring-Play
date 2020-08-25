package com.example.demo.lambdaTest.base;

import com.example.demo.lambdaTest.ExcelFailMark;
import com.example.demo.lambdaTest.convert.ExcelCellConverter;
import com.example.demo.lambdaTest.result.CellConvertResult;
import com.example.demo.lambdaTest.result.ExcelResolveResult;
import com.example.demo.lambdaTest.result.RowConvertResult;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:26
 * @description:
 */
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class ExcelHandler<E> {

    /**
     * 
     */
    private List<ExcelSheet> sheets;

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
     * 解析Excel文件
     *
     * @param inputStream excel文件流
     * @return 转换结果
     * @author: huangzuwang
     * @date: 2020-04-29 15:15
     **/
    public ExcelResolveResult<E> resolver(InputStream inputStream) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //工作表对象
        XSSFSheet sheet = workbook.getSheetAt(0);
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
            if (!StringUtils.equals(row.getCell(c).getStringCellValue(), headers[c])) {
                //TODO 文件模板错误
                throw new RuntimeException();
            }
        }
        //2.真正开始处理excel
        return processResolver(sheet);
    }

    /**
     * 解析处理Excel数据核心流程方法
     * @param sheet 工作表对象
     * @return 文件数据解析结果
     */
    private ExcelResolveResult<E> processResolver(XSSFSheet sheet){
        ExcelResolveResult<E> result = new ExcelResolveResult<>();
        List<E> successList = new ArrayList<>();
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

            RowConvertResult<E> rowResult = new RowConvertResult<>(targetInstance);
            //整行转换成功标识
            boolean rowSuccess = true;
            int c = 0;
            //每个单元格
            for (Map.Entry<String, ExcelCellConverter> entry : converterMap.entrySet()) {
                String fieldName = entry.getKey();
                ExcelCellConverter cellConverter = entry.getValue();
                CellConvertResult cellResult = cellConverter.convert(row.getCell(c), headers[c]);
                if (cellResult.getSuccess() == null) {
                    //转换失败
                    rowResult.putCellResult(fieldName, cellResult);
                    rowSuccess = false;
                    continue;
                }
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
                c++;
            }
            if (rowSuccess){
                successList.add(targetInstance);
            }else{
                failResults.add(rowResult);
            }
        }
        result.setSuccessList(successList);
        result.setFailResults(failResults);
        return result;
    }

    /**
     * 根据解析的结果生成文件
     * @author: huangzuwang
     * @date: 2020-05-11 10:53
     * @param resolveResult 解析的结果
     * @param fileName 生成文件的名称
     * @return
     **/
    public MultipartFile generate(ExcelResolveResult<E> resolveResult, String fileName){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("客户信息");
        //表头数据
        XSSFRow row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = row.createCell(i);
            XSSFRichTextString text = new XSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        return null;
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
