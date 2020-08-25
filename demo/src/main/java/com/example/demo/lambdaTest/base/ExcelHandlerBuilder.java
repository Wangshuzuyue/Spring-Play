package com.example.demo.lambdaTest.base;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 11:26
 * @description:
 */
public class ExcelHandlerBuilder {

    /**
     * excel处理器
     */
    private ExcelHandler excelHandler = new ExcelHandler();

    /**
     *
     * @param name sheet名称
     * @param clazz 实体对应class
     * @param <E>
     * @return
     */
    public <E> SheetHandler<E> createSheet(String name, Class<E> clazz){
        return excelHandler.createSheet(name, clazz);
    }

    public ExcelHandler build(){
        return excelHandler;
    }
}
