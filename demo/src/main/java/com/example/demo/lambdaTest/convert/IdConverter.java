package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:47
 * @description:
 */
public class IdConverter extends BaseCellConverter<Long> {

    @Override
    public CellConvertResult<Long> convert(Cell cell, String header) {
        CellConvertResult<Long> result = new CellConvertResult<>();
        StringBuffer sb = new StringBuffer();
        String value = cell.getStringCellValue();
        result.setOriData(value);
        if (!StringUtils.isNumeric(value)){
            result.setSuccess(false);
            sb.append("需为纯数字;");
        }
        if (StringUtils.length(value) < 10){
            result.setSuccess(false);
            sb.append("不可小于10位;");
        }
        if (result.isSuccess()){
            result.setData(Long.valueOf(value));
        }else{
            sb.insert(0, header);
        }
        return result;
    }
}
