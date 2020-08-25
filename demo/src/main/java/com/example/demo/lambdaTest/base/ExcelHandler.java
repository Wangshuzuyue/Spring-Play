package com.example.demo.lambdaTest.base;

import com.example.demo.lambdaTest.enums.ExcelWriteBackMode;
import com.example.demo.lambdaTest.convert.ExcelCellConverter;
import com.example.demo.lambdaTest.result.CellConvertResult;
import com.example.demo.lambdaTest.result.ExcelResolveResult;
import com.example.demo.lambdaTest.result.RowConvertResult;
import com.example.demo.lambdaTest.result.SheetResolveResult;
import com.example.demo.lambdaTest.util.ExcelUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.example.demo.lambdaTest.enums.ExcelFailMark.*;
import static com.example.demo.lambdaTest.enums.ExcelWriteBackMode.FAIL;
import static com.example.demo.lambdaTest.enums.ExcelWriteBackMode.SUCCESS;
import static org.apache.poi.ss.usermodel.FillPatternType.SOLID_FOREGROUND;

/**
 * @author: huangzuwang
 * @date: 2020-05-11 11:06
 * @description:
 */
public class ExcelHandler {

    private List<SheetHandler> sheetHandlers = new ArrayList<>();

    /**
     * 创建一个Sheet
     * @param sheetName sheet的名称
     * @param clazz 数据对应实体的class
     * @param <E> 实体类型
     * @return
     */
    <E> SheetHandler<E> createSheet(String sheetName, Class<E> clazz) {
        SheetHandler<E> sheetHandler = new SheetHandler<>(sheetName, clazz);
        sheetHandlers.add(sheetHandler);
        return sheetHandler;
    }

    /**
     * 解析Excel文件
     *
     * @param inputStream excel文件流
     * @return 转换结果
     * @author: huangzuwang
     * @date: 2020-04-29 15:15
     **/
    public ExcelResolveResult resolver(InputStream inputStream) throws IOException {
        ExcelResolveResult excelResult = new ExcelResolveResult();
        List<SheetResolveResult> sheetResolveResults = new ArrayList<>(sheetHandlers.size());
        excelResult.setSheetResolveResults(sheetResolveResults);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        int s = 0;
        for (SheetHandler sheetHandler : sheetHandlers) {
            XSSFSheet sheetAt = workbook.getSheetAt(s);
            SheetResolveResult resolve = sheetHandler.resolve(sheetAt);
            sheetResolveResults.add(resolve);
            s++;
        }
        return excelResult;
    }


    /**
     * 根据解析的结果生成文件流
     *
     * @param excelResult 解析的结果
     * @return 文件的输入流
     * @author: huangzuwang
     * @date: 2020-05-11 10:53
     **/
    public InputStream generate(ExcelResolveResult excelResult) {
        //重新整理结果【将successList中被标为失败的数据移到failList中】
        rePartResult(excelResult);

        List<SheetResolveResult> sheetResolveResults = excelResult.getSheetResolveResults();
        XSSFWorkbook workbook = new XSSFWorkbook();
        //每个sheet
        int sheetIndex = 0;
        for (SheetHandler sheetHandler : sheetHandlers) {
            XSSFSheet sheet = workbook.createSheet(sheetHandler.getName());
            //表头处理
            String[] headers = sheetHandler.getHeaders();
            XSSFRow headRow = generateHeader(sheet, headers);
            List failMarks = sheetHandler.getFailMarks();
            if (failMarks.contains(APPEND_REASON)){
                //尾列追加失败原因
                Cell cell = headRow.createCell(headers.length);
                XSSFRichTextString text = new XSSFRichTextString("失败原因");
                cell.setCellValue(text);
            }

            //数据处理
            SheetResolveResult sheetResolveResult = sheetResolveResults.get(sheetIndex);
            ExcelWriteBackMode writeBackMode = sheetHandler.getWriteBackMode();

            //成功的数据
            if (writeBackMode != FAIL){
                List successResults = sheetResolveResult.getSuccessResults();
                writeSuccessResult(successResults, sheet, writeBackMode);
            }

            //失败数据
            if (writeBackMode != SUCCESS){
                List<RowConvertResult<?>> failResults = sheetResolveResult.getFailResults();
                writeFailResult(failResults, sheet, failMarks, writeBackMode);
            }
            ExcelUtils.lineWidthAdaptive(sheet, headers);
            sheetIndex++;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            workbook.write(bos);
        } catch (IOException e) {
            //TODO Excel文件生成异常
            e.printStackTrace();
        }
        byte[] bArray = bos.toByteArray();
        return new ByteArrayInputStream(bArray);
    }

    /**
     * 根据List生成文件流【默认第一个sheet】
     * @param list
     * @return
     */
    public InputStream generateByList(List list){
        XSSFWorkbook workbook = new XSSFWorkbook();
        SheetHandler sheetHandler = sheetHandlers.get(0);
        XSSFSheet sheet = workbook.createSheet(sheetHandler.getName());
        String[] headers = sheetHandler.getHeaders();
        generateHeader(sheet, headers);
        try {
            writeList(list, sheet, sheetHandler);
        } catch (Exception e) {
            //TODO 生成文件流是吧
            e.printStackTrace();
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            workbook.write(bos);
        } catch (IOException e) {
            //TODO Excel文件生成异常
            e.printStackTrace();
        }
        byte[] bArray = bos.toByteArray();
        return new ByteArrayInputStream(bArray);
    }

    /**
     * 重新整理结果【将successList中被标为失败的数据移到failList中】
     * @param excelResult
     */
    private void rePartResult(ExcelResolveResult excelResult) {
        if (excelResult == null){
            return;
        }
        List<SheetResolveResult> sheetResolveResults = excelResult.getSheetResolveResults();
        if (CollectionUtils.isEmpty(sheetResolveResults)){
            return;
        }
        for (SheetResolveResult sheetResult : sheetResolveResults){
            List<RowConvertResult> successResults = sheetResult.getSuccessResults();
            List<RowConvertResult> failResults = sheetResult.getFailResults();
            if (CollectionUtils.isNotEmpty(successResults)){
                Iterator<RowConvertResult> iterator = successResults.iterator();
                while (iterator.hasNext()){
                    RowConvertResult rowResult = iterator.next();
                    if (!rowResult.isPass()){
                        failResults.add(rowResult);
                        iterator.remove();
                    }
                }
            }
        }
    }

    private XSSFRow generateHeader(XSSFSheet sheet, String[] headers){
        //表头处理
        XSSFRow headRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headRow.createCell(i);
            XSSFRichTextString text = new XSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        return headRow;
    }

    /**
     * 向文件写入成功的数据
     * @param successResults 成功的数据
     * @param sheet 页
     * @param writeBackMode 数据回写模式
     */
    private void writeSuccessResult(List<RowConvertResult<?>> successResults, XSSFSheet sheet, ExcelWriteBackMode writeBackMode){
        if (CollectionUtils.isNotEmpty(successResults)){
            int rowIndex = 1;
            for (RowConvertResult<?> rowResult : successResults){
                //每行数据
                //只回写成功记录，会改变原本行号； 回写数据包括成功数据，引用原行号
                int rowNum = writeBackMode == SUCCESS ? rowIndex : rowResult.getRowNum();
                XSSFRow row = sheet.createRow(rowNum);
                Map<String, CellConvertResult> convertResultMap = rowResult.getConvertResultMap();
                int colIndex = 0;
                for (Map.Entry<String, CellConvertResult> entry : convertResultMap.entrySet()){
                    //每个单元格
                    XSSFCell cell = row.createCell(colIndex);
                    CellConvertResult cellResult = entry.getValue();
                    cell.setCellValue(cellResult.getOriData());
                    colIndex++;
                }
                rowIndex++;
            }
        }
    }


    /**
     * 向文件写入失败的数据
     * @param failResults 失败数据
     * @param sheet 页
     * @param failMarks 失败标识方式
     * @param writeBackMode 数据回写模式
     */
    private void writeFailResult(List<RowConvertResult<?>> failResults, XSSFSheet sheet, List failMarks, ExcelWriteBackMode writeBackMode){
        if (CollectionUtils.isNotEmpty(failResults)){
            XSSFWorkbook workbook = sheet.getWorkbook();
            XSSFCellStyle style = workbook.createCellStyle();
            if (failMarks.contains(MARK_RED) || failMarks.contains(MARK_RED_ROW)){
                // 单元格标红方法
                style.setFillForegroundColor(IndexedColors.RED.getIndex());
                style.setFillPattern(SOLID_FOREGROUND);
            }
            int rowIndex = 1;
            for (RowConvertResult<?> rowResult : failResults){
                //每行数据
                //只回写失败记录时，会改变原本行号； 回写数据包括成功数据，引用原行号
                int rowNum = writeBackMode == FAIL ? rowIndex : rowResult.getRowNum();
                XSSFRow row = sheet.createRow(rowNum);
                Map<String, CellConvertResult> convertResultMap = rowResult.getConvertResultMap();
                int colIndex = 0;
                for (Map.Entry<String, CellConvertResult> entry : convertResultMap.entrySet()){
                    //每个单元格
                    XSSFCell cell = row.createCell(colIndex);
                    CellConvertResult cellResult = entry.getValue();
                    if (failMarks.contains(MARK_RED_ROW)
                            || (!cellResult.isSuccess() && failMarks.contains(MARK_RED))){
                        cell.setCellStyle(style);
                    }
                    cell.setCellValue(cellResult.getOriData());
                    colIndex++;
                }
                if (failMarks.contains(APPEND_REASON)){
                    XSSFCell cell = row.createCell(colIndex);
                    cell.setCellValue(rowResult.getReason());
                }
                rowIndex++;
            }
        }
    }

    private void writeList(List list, XSSFSheet sheet, SheetHandler sheetHandler) throws Exception {
        if (CollectionUtils.isNotEmpty(list)){
            int rowIndex = 1;
            for (Object object : list){
                //每行数据
                XSSFRow row = sheet.createRow(rowIndex);
                Map<String, ExcelCellConverter> converterMap = sheetHandler.getConverterMap();
                int colIndex = 0;
                for (Map.Entry<String, ExcelCellConverter> entry : converterMap.entrySet()){
                    //每个单元格
                    XSSFCell cell = row.createCell(colIndex);
                    String fieldName = entry.getKey();
                    Class<?> clazz = object.getClass();
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    Object value = field.get(object);
                    cell.setCellValue(value.toString());
                    colIndex++;
                }
                rowIndex++;
            }
        }
    }
}
