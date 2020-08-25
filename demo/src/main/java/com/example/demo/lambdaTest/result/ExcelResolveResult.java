package com.example.demo.lambdaTest.result;

import lombok.Data;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description:
 */
@Data
public class ExcelResolveResult {

    /**
     * 每个Sheet的解析结果
     */
    List<SheetResolveResult> sheetResolveResults;

}
