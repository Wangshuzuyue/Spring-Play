package com.hzw.play.mycat.datasource;

import java.lang.annotation.*;

/**
 * @author: huangzuwang
 * @date: 2019-10-20 22:31
 * @description: 多数据源注解
 * 指定要使用的数据源
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    /**
     * 数据源名称
     * @return
     */
    String name() default "";

}
