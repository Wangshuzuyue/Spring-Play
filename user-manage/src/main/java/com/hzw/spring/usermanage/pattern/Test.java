package com.hzw.spring.usermanage.pattern;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/14 11:39
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        String content1 = "融资租赁协议\n" +
                "编号：2233495aaa\n" +
                "甲方（出租人）：{{companyName}}\n" +
                "地址：浙江省杭州市余杭区五常大道175号\n" +
                "联系电话：4008010010\n" +
                "电子邮箱：leasecs@souche.com\n" +
                " \n" +
                "乙方（承租人）：{{userName}}\n" +
                "身份证号码： {{idCardNo}} \n" +
                "联系电话：{{mobile}}\n";
        String pattern1 = ".*[编号：2233495aaa]{1}.*";
        System.out.println("1>>>> " + Pattern.matches(pattern1, content1));
        System.out.println("1.5>>>> " + content1.contains("编号：2233495aaa"));


        DecimalFormat df4 = new DecimalFormat("#,##0.00");
        BigDecimal restAmount = new BigDecimal("200000");
        String format = df4.format(restAmount);
        String content21 = "乙方可以人民币【200,000.00】元整的价格一次性支付标的车辆的尾款";
        String content22 = "乙方可以人民币【"+format+"】元整的价格一次性支付标的车辆的尾款";
        System.out.println(content21);
        System.out.println(content22);





        String content3 = "Chapter 10";
        String pattern3 = "Chapter [1-9][0-9]*";
        System.out.println("2>>>> " + Pattern.matches(pattern3, content3));

    }
}
