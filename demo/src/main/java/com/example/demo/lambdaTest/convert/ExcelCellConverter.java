package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:45
 * @description: Excel 列数据校验器
 */
public interface ExcelColDataConverter<T> {

    /**
     * 转换数据
     * @param row 整行
     * @param cell 单元格
     * @return 转换结果
     */
    CellConvertResult<T> convert(Row row, Cell cell);
}
