package com.example.demo.lambdaTest;

import com.example.demo.lambdaTest.base.ExcelHandler;
import com.example.demo.lambdaTest.base.ExcelHandlerBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:39
 * @description:
 */
public class ExcelListTest {

//    @Bean(name = "taskExcelHandlerOnline")
//    public ExcelHandler<Task> taskExcelHandler(){
//
//        return excelHandler;
//    }


    public static void main(String[] args) throws Exception {
        //构建
        ExcelHandlerBuilder builder = new ExcelHandlerBuilder();
        builder.createSheet("客户清单", Task.class)
                .setHeaders(new String[]{"客户签约姓名", "客户签约身份证号"})
                .appendCol(Task::getName)
                .appendCol(Task::getCertNo);

        ExcelHandler excelHandler = builder.build();


        //使用
        try {
            List<Task> taskList = new ArrayList<>();
            Task task1 = new Task();
            task1.setCertNo("12321");
            task1.setName("hzw1");
            taskList.add(task1);
            Task task2 = new Task();
            task2.setCertNo("12322");
            task2.setName("hzw2");
            taskList.add(task2);
            Task task3 = new Task();
            task3.setCertNo("123213");
            task3.setName("hzw3");
            taskList.add(task3);


            InputStream generateInputStream = excelHandler.generateByList(taskList);
            OutputStream outputStream = new FileOutputStream("/Users/huangzuwang/Documents/生成文件名12322.xlsx");
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
