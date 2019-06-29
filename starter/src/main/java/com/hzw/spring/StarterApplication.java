package com.hzw.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.hzw.*"})
@MapperScan("com.hzw.spring.*.provider.mapper")
public class StarterApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}
