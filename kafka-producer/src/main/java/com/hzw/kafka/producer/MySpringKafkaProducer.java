package com.hzw.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author: huangzuwang
 * @date: 2019-08-20 00:46
 * @description:
 */
@Component
public class MySpringKafkaProducer {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    public void send() throws InterruptedException {
        for (int i = 0; i < 300; i++){
            String msg = "data" + i;
            kafkaTemplate.send("testhzw",1, msg);
            System.out.println("生产端发送 " + msg + " ---->" );
            TimeUnit.SECONDS.sleep(2);
        }
    }

}
