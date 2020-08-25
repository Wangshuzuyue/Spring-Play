package com.hzw.oss.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hzw.oss.play"})
public class OssPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssPlayApplication.class, args);
    }

}
