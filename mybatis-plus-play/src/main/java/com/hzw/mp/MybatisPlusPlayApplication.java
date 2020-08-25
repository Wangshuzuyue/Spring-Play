package com.hzw.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: huangzuwang
 * @date: 2019-11-29 11:22
 * @description:
 */
@SpringBootApplication
@MapperScan("com.hzw.mp.mapper")
public class MybatisPlusPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusPlayApplication.class, args);
    }
}
