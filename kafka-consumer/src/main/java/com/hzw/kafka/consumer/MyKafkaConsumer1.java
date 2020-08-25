package com.hzw.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * @author: huangzuwang
 * @date: 2019-08-19 17:39
 * @description:
 */
public class MyKafkaConsumer1 extends Thread{

    KafkaConsumer<Integer, String> consumer;

    String topic;

    volatile static int count = 0;


    public MyKafkaConsumer1(String topic) {
        this.topic = topic;
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.5.221:9092,172.16.5.222:9092,172.16.5.223:9092");
        properties.put(ConsumerConfig.CLIENT_ID_CONFIG, "hzw-consumer");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "hzw-group-partition-01");
        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        //自动提交（批量确认）
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        //能够消费启动前未消费的数据
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumer = new KafkaConsumer<>(properties);
    }

    @Override
    public void run() {
        consumer.subscribe(Collections.singleton(this.topic));
        while (true){
            ConsumerRecords<Integer, String> consumerRecords = consumer.poll(Duration.ofSeconds(1));
            consumerRecords.forEach(record -> {
                System.out.println(String.format("MyKafkaConsumer1: %s --> %s --> %s",
                        record.key(), record.value(), record.offset()));
                    count++;
            });
        }
    }

    public static void main(String[] args) {
        new MyKafkaConsumer1("testhzwPartitionReplication").start();
        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
        }
    }
}
