package com.example.demo.lambdaTest.result;

import lombok.Data;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description: 单元格转换结果
 */
@Data
public class CellConvertResult<R> {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 原数据
     */
    private String oriData;

    /**
     * 转换成功后的数据
     */
    private R data;

    /**
     * 失败原因
     */
    private String failReason;
}
