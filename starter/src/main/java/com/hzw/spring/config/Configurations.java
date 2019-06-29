package com.hzw.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by huangzuwang on 18/1/29.
 */
@Configuration
public class Configurations {

    @Bean
    public MapperScannerConfigurer MapperScannerConfigurer(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.isea533.mybatis.mapper");
        Properties props = new Properties();
        props.setProperty("mappers","tk.mybatis.mapper.common.Mapper");
        configurer.setProperties(props);
        return configurer;
    }
}
