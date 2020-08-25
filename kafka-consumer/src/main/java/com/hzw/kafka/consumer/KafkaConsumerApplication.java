package com.hzw.kafka.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(KafkaConsumerApplication.class, args);
        new MyKafkaConsumer1("testhzwPartition").start();
        new MyKafkaConsumer2("testhzwPartition").start();
        new MyKafkaConsumer3("testhzwPartition").start();
    }

}
