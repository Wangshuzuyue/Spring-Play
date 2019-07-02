package com.hzw.spring.usermanage.mybatis.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Auther: huangzuwang
 * @Date: 2019-07-01 15:11
 * @Description:
 */
@Configuration
public class Config {
//    @Bean
//    public MyPageIntercepter sqlStatsInterceptor(){
//        MyPageIntercepter myPageIntercepter = new MyPageIntercepter();
//        Properties properties = new Properties();
//        properties.setProperty("dialect", "mysql");
//        myPageIntercepter.setProperties(properties);
//        return myPageIntercepter;
//    }
//
    @Bean
    public SQLInterceptor sqlStatsInterceptor(){
        SQLInterceptor sqlInterceptor = new SQLInterceptor();
        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        sqlInterceptor.setProperties(properties);
        return sqlInterceptor;
    }
}
