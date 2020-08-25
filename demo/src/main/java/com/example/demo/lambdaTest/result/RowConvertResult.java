package com.example.demo.lambdaTest.result;

import com.example.demo.lambdaTest.base.TypeFunction;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description: 行转换结果
 */
public class RowConvertResult<T> {

    /**
     * 行数据对象
     */
    @Getter
    private T entity;

    /**
     * 行号
     */
    @Getter
    private int rowNum;

    /**
     * 整行的解析结果
     */
    @Getter
    @Setter
    private boolean pass = true;

    /**
     * 行转换结果 key:属性名， value 单元格转换结果
     */
    @Getter
    private Map<String, CellConvertResult> convertResultMap = new LinkedHashMap<>();

    /**
     * 整行结果拼接的缓存
     */
    private StringBuffer sb = new StringBuffer();

    public RowConvertResult(T entity, int rowNum) {
        this.entity = entity;
        this.rowNum = rowNum;
    }

    /**
     * 添加某个属性校验结果
     * @param fieldName 属性名
     * @param cellResult 校验结果
     */
    public void putCellResult(String fieldName, CellConvertResult cellResult){
        convertResultMap.put(fieldName, cellResult);
    }

    /**
     * 添加某个属性校验结果【Lambda】【直接覆盖之前的】
     * @param fieldFunc 属性
     * @param cellResult 校验结果
     */
    public void putCellResultLambda(TypeFunction<T, ?> fieldFunc, CellConvertResult cellResult){
        convertResultMap.put(TypeFunction.getLambdaFieldName(fieldFunc), cellResult);
    }

    /**
     * 获取整行数据的校验结果
     * @return
     */
    public String getReason(){
        for (Map.Entry<String, CellConvertResult> entry : convertResultMap.entrySet()){
            CellConvertResult dataConvertResult = entry.getValue();
            if (dataConvertResult != null){
                String failReason = dataConvertResult.getFailReason();
                if (StringUtils.isNotBlank(failReason)){
                    sb.append(failReason);
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    /**
     * 获取某个属性的转换结果
     * @param fieldFunc
     * @return
     */
    public CellConvertResult getCellConvertResult(TypeFunction<T, ?> fieldFunc){
        return convertResultMap.get(TypeFunction.getLambdaFieldName(fieldFunc));
    }

    /**
     * 追加某个属性的失败校验结果
     * @param fieldFunc 字段
     * @param reason 原因
     */
    public void appendFailReason(TypeFunction<T, ?> fieldFunc, String reason){
        pass = false;
        String fieldName = TypeFunction.getLambdaFieldName(fieldFunc);
        CellConvertResult cellConvertResult = convertResultMap.get(fieldName);
        cellConvertResult.setSuccess(false);
        if (StringUtils.isBlank(cellConvertResult.getFailReason())){
            cellConvertResult.setFailReason(reason);
        }else{
            cellConvertResult.setFailReason(String.format("%s,%s", cellConvertResult.getFailReason(), reason));
        }
    }
}
