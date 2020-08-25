package com.hzw.kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaProducerApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaProducerApplication.class, args);
        MySpringKafkaProducer producer = context.getBean(MySpringKafkaProducer.class);
        producer.send();
    }

}
