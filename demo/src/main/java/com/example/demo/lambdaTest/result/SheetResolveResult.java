package com.example.demo.lambdaTest.result;

import lombok.Data;

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
    List<T> successList;

    /**
     * 转换失败结果列表
     */
    List<RowConvertResult<T>> failResults;

//    /**
//     * 结果文件【失败时】
//     */
//    MultipartFile file;
}
