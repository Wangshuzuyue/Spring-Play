package com.hzw.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author: huangzuwang
 * @date: 2019-08-20 00:53
 * @description:
 */
@Component
public class MySpringKafkaConsumer {

    @KafkaListener(topics = {"testhzw"})
    public void listener(ConsumerRecord record){
        Optional<Object> msg = Optional.ofNullable(record.value());
        if (msg.isPresent()){
            System.out.println("----> 消费端接收:" + msg.get());
        }
    }
}
