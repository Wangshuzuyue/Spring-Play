package com.example.demo.lambdaTest.result;

import lombok.Data;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description:
 */
@Data
public class DataConvertResult<T> {

    /**
     * 原数据
     */
    private String oriData;

    /**
     * 转换成功后的数据
     */
    private T data;

    /**
     * 失败原因
     */
    private String failReason;

}
