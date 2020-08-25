package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.result.CellConvertResult;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: huangzuwang
 * @date: 2020-05-12 10:44
 * @description:
 */
@Data
public abstract class BaseCellConverter<T> implements ExcelCellConverter<T>{

    protected boolean notNull;

    /**
     * 验证必填
     * @param result 结果对象
     * @param header 表头
     * @param value 值
     * @return 验证通过
     */
    protected boolean validateNotNull(CellConvertResult result, String header, Object value){
        if (!notNull){
            return true;
        }
        if (value == null || StringUtils.isBlank(value.toString())){
            result.setSuccess(false);
            result.setFailReason(header + "不能为空");
            return false;
        }
        return true;
    }
}
