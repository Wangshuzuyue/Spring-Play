package com.hzw.pay.enums;

/**
 * @author: huangzuwang
 * @date: 2019-12-29 23:44
 * @description:
 */
public enum TestEnum {

    A(1, "aaa");

    TestEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;

    private String desc;
}
