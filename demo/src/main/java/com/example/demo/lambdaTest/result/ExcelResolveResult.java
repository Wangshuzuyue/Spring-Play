package com.example.demo.lambdaTest;

import lombok.Data;

import java.io.File;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description:
 */
@Data
public class ExcelResolveResult<T> {

    /**
     * 转换成功的数据列表
     */
    List<T> list;

    /**
     * 转换失败结果列表
     */
    List<RowConvertResult> failResults;

    /**
     * 结果文件【失败时】
     */
    File file;
}
