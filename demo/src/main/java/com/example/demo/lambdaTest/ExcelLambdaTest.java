package com.example.demo.lambdaTest;

import com.example.demo.lambdaTest.base.ExcelHandler;
import com.example.demo.lambdaTest.base.ExcelHandlerBuilder;
import com.example.demo.lambdaTest.convert.CertNoConverter;
import com.example.demo.lambdaTest.convert.DefaultStringConverter;
import com.example.demo.lambdaTest.enums.ExcelWriteBackMode;
import com.example.demo.lambdaTest.result.ExcelResolveResult;
import com.example.demo.lambdaTest.result.RowConvertResult;
import com.example.demo.lambdaTest.result.SheetResolveResult;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.example.demo.lambdaTest.enums.ExcelFailMark.*;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:39
 * @description:
 */
public class ExcelLambdaTest {

//    @Bean(name = "taskExcelHandlerOnline")
//    public ExcelHandler<Task> taskExcelHandler(){
//
//        return excelHandler;
//    }


    public static void main(String[] args) throws Exception {
        //构建
        ExcelHandlerBuilder builder = new ExcelHandlerBuilder();
        builder.createSheet("客户清单", Task.class)
                .setFailMarks(Arrays.asList(MARK_RED, APPEND_REASON))
                .setWriteBackMode(ExcelWriteBackMode.FAIL)
                .setHeaders(new String[]{"客户签约姓名", "客户签约身份证号"})
                .appendCol(Task::getName, DefaultStringConverter.class, true)
                .appendCol(Task::getCertNo, CertNoConverter.class,true);

        builder.createSheet("客户清单2", Task1.class)
                .setFailMarks(Collections.singletonList(MARK_RED))
                .setWriteBackMode(ExcelWriteBackMode.SUCCESS_FAIL)
                .setHeaders(new String[]{"客户签约姓名1", "客户签约身份证号1"})
                .appendCol(Task1::getName1, DefaultStringConverter.class,true)
                .appendCol(Task1::getCertNo1, CertNoConverter.class,true);

        ExcelHandler excelHandler = builder.build();


        InputStream inputStream = new FileInputStream("/Users/huangzuwang/Documents/批量上传客户模板-线上-格式正确.xlsx");

        //使用
        //解析文件
        try {
            ExcelResolveResult excelResult = excelHandler.resolver(inputStream);
            List<SheetResolveResult> sheetResolveResults = excelResult.getSheetResolveResults();
            //此处要注意泛型写正确
            SheetResolveResult<Task> sheetResolveResult = sheetResolveResults.get(0);
            List<RowConvertResult<Task>> successResults = sheetResolveResult.getSuccessResults();

//            for (RowConvertResult<Task> rowResult : successResults){
//                Task task = rowResult.getEntity();
//                rowResult.appendFailReason(Task::getName, "名字不正确");
//                rowResult.appendFailReason(Task::getName, "名字格式不正确");
//            }

            //TODO 校验业务逻辑


            InputStream generateInputStream = excelHandler.generate(excelResult);
            OutputStream outputStream = new FileOutputStream("/Users/huangzuwang/Documents/生成文件名"+ System.currentTimeMillis() +".xlsx");
            byte[] b = new byte[4096];
            int len;
            while((len =generateInputStream.read(b)) != -1){
                outputStream.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
