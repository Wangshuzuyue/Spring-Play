package com.hzw.play.mycat;

import com.hzw.play.mycat.datasource.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@MapperScan("com.hzw.play.mycat.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
public class MycatPlayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MycatPlayApplication.class, args);
    }
}
