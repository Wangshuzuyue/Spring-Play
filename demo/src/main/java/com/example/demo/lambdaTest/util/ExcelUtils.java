package com.example.demo.lambdaTest.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.poi.ss.usermodel.CellType.STRING;

/**
 * @Description excel通用方法
 * @Author WangDong
 * @Date 2019-12-24
 */
@Slf4j
public class ExcelUtils {

    /**
     * @param d
     * @return String
     * @description: Excel中对数字的处理
     * @auther: WangDong
     * @createTime 2019-12-19
     */
    private static Pattern NUM_PATTERN = Pattern.compile(".0$");

    public static String getRealStringValueOfDouble(double d) {
        String doubleStr = String.valueOf(d);
        boolean b = doubleStr.contains("E");
        int indexOfPoint = doubleStr.indexOf('.');
        if (b) {
            int indexOfE = doubleStr.indexOf('E');
            BigInteger xs = new BigInteger(doubleStr.substring(indexOfPoint
                    + BigInteger.ONE.intValue(), indexOfE));
            int pow = Integer.valueOf(doubleStr.substring(indexOfE
                    + BigInteger.ONE.intValue()));
            int xsLen = xs.toByteArray().length;
            int scale = xsLen - pow > 0 ? xsLen - pow : 0;
            doubleStr = String.format("%." + scale + "f", d);
        } else {
            Pattern p = NUM_PATTERN;
            Matcher m = p.matcher(doubleStr);
            if (m.find()) {
                doubleStr = doubleStr.replace(".0", "");
            }
        }
        return doubleStr;
    }

    /**
     * @param cell
     * @return String
     * @description: Excel中读取数据处理
     * @auther: WangDong
     * @createTime 2020-03-16
     */
    public static String getDataToString(Cell cell) {
        if (cell == null) {
            return null;
        }
        String stringCellValue;
        try {
            stringCellValue = cell.getStringCellValue();
            if (!Objects.isNull(stringCellValue)) {
                // ASCII码中除了32之外还有160这个特殊的空格,而这个ASCII值为160的空格，其实是不间断空格(non-breaking space)
                // 我们可以利用不间断空格的Unicode编码来移除它，其编码为\u00A0
                return stringCellValue.trim().replaceAll("\\u00A0+", "").replaceAll(" ", "");
            }
        } catch (Throwable e) {
            log.info("读取格式不是STRING格式");
        }
        try {
            double numericCellValue = cell.getNumericCellValue();
            stringCellValue = ExcelUtils.getRealStringValueOfDouble(numericCellValue);
            if (!Objects.isNull(stringCellValue)) {
                return stringCellValue.trim().replaceAll("\\u00A0+", "").replaceAll(" ", "");
            }
        } catch (Throwable b) {
            log.info("读取格式不是NUMERIC格式");
        }
        return null;
    }

    /**
     * Excel中读取String数据, 并去除空格
     * @author: huangzuwang
     * @date: 2020-04-21 16:18
     * @param cell
     * @return
     **/
    public static String getDataToStringWithoutSpace(Cell cell){
        String str = getDataToString(cell);
        return str != null ? str.replace(" ", "") : null;
    }

    public static void lineWidthAdaptive(XSSFSheet sheet, String[] headers) {
        for (int colNum = 0; colNum < headers.length; colNum++) {
            int columnWidth = sheet.getColumnWidth(colNum) / 256;
            for (int rowNumStyle = 0; rowNumStyle < sheet.getLastRowNum(); rowNumStyle++) {
                XSSFRow currentRow;
                //当前行未被使用过
                if (sheet.getRow(rowNumStyle) == null) {
                    currentRow = sheet.createRow(rowNumStyle);
                } else {
                    currentRow = sheet.getRow(rowNumStyle);
                }
                if (currentRow.getCell(colNum) != null) {
                    Cell currentCell = currentRow.getCell(colNum);
                    if (currentCell.getCellTypeEnum() == STRING) {
                        int length = currentCell.getStringCellValue().getBytes().length;
                        if (columnWidth < length) {
                            columnWidth = length;
                        }
                    }
                }
            }
            if (colNum == 0) {
                sheet.setColumnWidth(colNum, (columnWidth - 2) * 128);
            } else {
                sheet.setColumnWidth(colNum, (columnWidth + 4) * 256);
            }
        }
    }

    /**
     * 校验时间
     *
     * @param signedTime
     * @return
     */
    public static boolean checkTime(String signedTime) {
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            format.setLenient(false);
            format.parse(signedTime);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * @param cell
     * @return String
     * @description: Excel中读取日期数据处理
     * @auther: WangDong
     * @createTime 2020-03-16
     */
    public static String getDateToString(Cell cell) {
        if (cell == null) {
            return null;
        }
        String stringCellValue;
        try {
            Date dateCellValue = cell.getDateCellValue();
            if (!Objects.isNull(dateCellValue)) {
                DateFormat formatInfo = new SimpleDateFormat("yyyy/MM/dd");
                return formatInfo.format(dateCellValue);
            }
        } catch (Throwable e) {
            log.info("读取格式不是日期格式");
        }
        try {
            stringCellValue = cell.getStringCellValue();
            if (!Objects.isNull(stringCellValue)) {
                return stringCellValue.trim().replaceAll("\\u00A0+", "");
            }
        } catch (Throwable e) {
            log.info("读取格式不是STRING格式");
        }
        return null;
    }

}
