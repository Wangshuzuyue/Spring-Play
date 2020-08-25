package com.hzw.pay;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: huangzuwang
 * @date: 2019-09-05 18:22
 * @description:
 */
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface NameMapping {

    String[] names() default {};
}
