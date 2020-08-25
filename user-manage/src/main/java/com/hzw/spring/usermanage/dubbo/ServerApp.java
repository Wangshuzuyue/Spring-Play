package com.hzw.spring.usermanage.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-07-24 15:54
 * @description:
 */
public class ServerApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"/META-INF/spring/application.xml"});
        applicationContext.start();
        System.out.println(System.in.read());
    }
}
