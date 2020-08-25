package com.example.demo.lambdaTest;

import com.example.demo.lambdaTest.convert.ExcelCellConverter;
import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:47
 * @description:
 */
public class IdConverter implements ExcelCellConverter {

    @Override
    public CellConvertResult convert( Cell cell) {
        CellConvertResult result = new CellConvertResult();
        StringBuffer sb = new StringBuffer();
        String value = cell.getStringCellValue();
        result.setOriData(value);
        if (!StringUtils.isNumeric(value)){
            result.setSuccess(false);
            sb.append("ID需为纯数字");
        }
        if (StringUtils.length(value) < 10){
            result.setSuccess(false);
            sb.append("ID不可小于10位");
        }
        if (result.getSuccess()){
            result.setData(Long.valueOf(value));
        }
        return result;
    }
}
