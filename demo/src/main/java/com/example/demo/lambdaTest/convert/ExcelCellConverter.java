package com.example.demo.lambdaTest.convert;

import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:45
 * @description: Excel 单元格数据转换
 */
public interface ExcelCellConverter<R> {

    /**
     * 转换数据
     * @param cell 单元格
     * @param header 表头
     * @return 转换结果
     */
    CellConvertResult<R> convert(Cell cell, String header);

    /**
     * 设置是否必填
     * @param notNull
     */
    void setNotNull(boolean notNull);
}
