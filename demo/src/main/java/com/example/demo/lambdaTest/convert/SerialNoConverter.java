package com.example.demo.lambdaTest;

import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:47
 * @description:
 */
public class SerialNoConverter implements ExcelColDataConverter<String> {

    @Override
    public DataConvertResult<String> convert(Cell cell, int index) {
        DataConvertResult<String> result = new DataConvertResult<>();


        return result;
    }
}
