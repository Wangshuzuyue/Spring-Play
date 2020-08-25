package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:47
 * @description:
 */
public class DefaultConverter extends BaseCellConverter<String>{

    @Override
    public CellConvertResult<String> convert(Cell cell, String header) {
            CellConvertResult<String> result = new CellConvertResult<>();
            result.setSuccess(true);
            String value = cell.getStringCellValue();
            result.setOriData(value);
            result.setData(value);
            return result;
    }
}
