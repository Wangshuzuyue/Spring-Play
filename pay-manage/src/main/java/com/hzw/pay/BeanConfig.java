package com.hzw.pay;

import org.springframework.context.annotation.Bean;

/**
 * @author: huangzuwang
 * @date: 2019-09-05 17:30
 * @description:
 */
//@Configuration
public class BeanConfig {


    @Bean(name = {"TestImpl1","TestImpl1111"})
    public TestInterFace getTestInterFace1(){
        return new TestImpl1();
    }
}
