package com.example.demo.lambdaTest.base;

import com.example.demo.lambdaTest.result.CellConvertResult;
import org.apache.poi.ss.usermodel.Cell;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: huangzuwang
 * @date: 2020-05-12 10:59
 * @description:
 */
public class ExcelConvertUtil {

    /**
     * 获取String类型结果
     * @param cell 单元格对象
     * @param header 表头
     */
    public static CellConvertResult<String> convertStringResult(Cell cell, String header){
        CellConvertResult<String> result = new CellConvertResult<>();
        result.setSuccess(true);
        try {
            String value = cell.getStringCellValue();
            result.setOriData(value);
            result.setData(value);
        }catch (Exception e){
            result.setSuccess(false);
            result.setFailReason(header + "数据非法");
            e.printStackTrace();
            System.out.println(e);
        }
        return result;
    }

    /**
     * 获取Integer类型结果
     * @param cell 单元格对象
     * @param header 表头
     */
    public static CellConvertResult<Integer> convertIntResult(Cell cell, String header){
        CellConvertResult<Integer> result = new CellConvertResult<>();
        result.setSuccess(true);
        try {
            String stringCellValue = cell.getStringCellValue();
            result.setOriData(stringCellValue);
            int i = Integer.parseInt(stringCellValue);
            result.setData(i);
        }catch (Exception e){
            result.setSuccess(false);
            result.setFailReason(header + "数据非法");
            e.printStackTrace();
            System.out.println(e);
        }
        return result;
    }

    /**
     * 获取Long类型结果
     * @param cell 单元格对象
     * @param header 表头
     * @return
     */
    public static CellConvertResult<Long> convertLongResult(Cell cell, String header){
        CellConvertResult<Long> result = new CellConvertResult<>();
        result.setSuccess(true);
        try {
            String value = cell.getStringCellValue();
            result.setOriData(value);
            result.setData(Long.parseLong(value));
        }catch (Exception e){
            result.setSuccess(false);
            result.setFailReason(header + "数据非法");
            e.printStackTrace();
            System.out.println(e);
        }
        return result;
    }

    /**
     * 获取BigDecimal类型结果
     * @param cell 单元格对象
     * @param header 表头
     */
    public static CellConvertResult<BigDecimal> convertBigDecimalResult(Cell cell, String header){
        CellConvertResult<BigDecimal> result = new CellConvertResult<>();
        result.setSuccess(true);
        try {
            String value = cell.getStringCellValue();
            result.setOriData(value);
            result.setData(new BigDecimal(value));
        }catch (Exception e){
            result.setSuccess(false);
            result.setFailReason(header + "数据非法");
            e.printStackTrace();
            System.out.println(e);
        }
        return result;
    }

    /**
     * 获取Date类型结果
     * @param cell 单元格对象
     * @param header 表头
     */
    public static CellConvertResult<Date> convertDateResult(Cell cell, String header){
        CellConvertResult<Date> result = new CellConvertResult<>();
        result.setSuccess(true);
        try {
            String oriValue = cell.getStringCellValue();
            Date value = cell.getDateCellValue();
            result.setOriData(oriValue);
            result.setData(value);
        }catch (Exception e){
            result.setSuccess(false);
            result.setFailReason(header + "数据非法");
            e.printStackTrace();
            System.out.println(e);
        }
        return result;
    }

}
