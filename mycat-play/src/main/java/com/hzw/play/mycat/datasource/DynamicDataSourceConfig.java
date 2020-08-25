package com.hzw.play.mycat.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2019-10-20 22:42
 * @description:
 */
@Configuration
public class DynamicDataSourceConfig {

    public static final String FIRST_NAME = "firstDataSource";
    public static final String SECOND_NAME = "secondDataSource";

    @Bean
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource secondDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource firstDataSource, DataSource secondDataSource){
        Map<Object, Object> targetDataSources = new HashMap<>(5);
        targetDataSources.put(FIRST_NAME, firstDataSource);
        targetDataSources.put(SECOND_NAME, secondDataSource);
        return new DynamicDataSource(firstDataSource, targetDataSources);
    }
}
