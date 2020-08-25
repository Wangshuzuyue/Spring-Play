package com.hzw.mybatis.lessxml;

import com.hzw.mybatis.lessxml.entity.B;
import com.hzw.mybatis.lessxml.utils.BeanUtil;

import java.math.BigDecimal;

/**
 * @author: huangzuwang
 * @date: 2019-09-18 19:13
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.setA1("  a 1  ");
        b.setA2("  a2  ");
        b.setA3(456);
        b.setB1("  b 1  ");
        b.setB2("  b2  ");
        b.setB3(new BigDecimal("123"));
        BeanUtil.trim(b, false);
        System.out.println(b);
    }
}
