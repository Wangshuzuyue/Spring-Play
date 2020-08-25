package com.hzw.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.IOException;
import java.util.Properties;

/**
 * @author: huangzuwang
 * @date: 2019-08-19 17:21
 * @description:
 */
public class MyKafkaProducer extends Thread{

    KafkaProducer<Integer, String> producer;

    String topic;

    Properties properties = new Properties();

    public MyKafkaProducer(String topic) {
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.5.221:9092,172.16.5.222:9092,172.16.5.223:9092");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "hzw-producer1");
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, MyPartitioner.class.getName());
        //批量发送
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, "100");
        //批量发送徘徊时间
        properties.put(ProducerConfig.LINGER_MS_CONFIG, "1000");
        properties.put(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, "1000000");
        properties.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, "1000000");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        producer = new KafkaProducer<>(properties);
        this.topic = topic;
    }

    @Override
    public void run() {
        int count = 100000;
        while (count > 0){
            String msg = String.format("[%s]消息!![%s]----by hzw-producer1", topic, count);
            try {
                //拿到发送结果
                System.out.println("准备发送消息:" + msg);
                //同步发送
//                RecordMetadata recordMetadata = producer.send(new ProducerRecord<>(topic, msg)).get();
//                System.out.println(String.format("%s --> %s --> %s",
//                        recordMetadata.offset(), recordMetadata.partition(), recordMetadata.topic()));

                //异步发送
                producer.send(new ProducerRecord<>(topic, msg), (metaData, exception) ->{

                    System.out.println(String.format("%s --> %s --> %s",
                            metaData.offset(), metaData.partition(), metaData.topic()));
                    System.out.println(">>>>>异常内容:" + exception);
                });

//                TimeUnit.MILLISECONDS.sleep(1000);

                count--;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws IOException {
        new MyKafkaProducer("testhzwPartitionReplication").start();
        System.in.read();
    }
}
