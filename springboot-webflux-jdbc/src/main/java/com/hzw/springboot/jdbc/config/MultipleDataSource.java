package com.hzw.springboot.jdbc.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


/**
 * @author: huangzuwang
 * @date: 2019-09-10 19:32
 * @description:
 */
@Configuration
public class MultipleDataSource {

    @Primary
    @Bean
    public DataSource masterDataSource(){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        DataSource dataSource = dataSourceBuilder
                .url("jdbc:mysql://localhost:3306/bfq_business?characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8")
                .username("root")
                .password("12345678")
                .build();
        return dataSource;
    }

    @Bean
    public DataSource slaveDataSource(){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        DataSource dataSource = dataSourceBuilder
                .url("jdbc:mysql://localhost:3306/zzq1?characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8")
                .username("root")
                .password("12345678")
                .build();
        return dataSource;
    }

    public static void main(String[] args) {
        if(1==1) System.out.println("");
    }
}
