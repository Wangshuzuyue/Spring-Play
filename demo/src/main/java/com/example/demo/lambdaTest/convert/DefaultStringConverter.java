package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.base.ExcelConvertUtil;
import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:47
 * @description:
 */
public class DefaultStringConverter extends BaseCellConverter<String>{

    @Override
    public CellConvertResult<String> convert(Cell cell, String header) {
        CellConvertResult<String> result = ExcelConvertUtil.convertStringResult(cell, header);
        if (!result.isSuccess()){
            return result;
        }
        if (!validateNotNull(result, header, result.getData())){
            return result;
        }
        return result;
    }
}
