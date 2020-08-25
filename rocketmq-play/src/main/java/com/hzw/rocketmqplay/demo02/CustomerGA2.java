package com.hzw.rocketmqplay.demo02;


import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-07-01 23:06
 * @description:
 */
public class CustomerGA1 {

    public static void main(String[] args) throws Exception {
        //同一group下的Customer只会有一个消费消息
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("hzw-group-a");
        //设置nameserver地址
        consumer.setNamesrvAddr("39.107.238.67:9876");
        //消费超时时间 单位分钟, 默认15分钟
        consumer.setConsumeTimeout(15);

        //每个customer关注一个topic
        //消息过滤器
        MessageSelector messageSelector = MessageSelector.bySql("age >= 18 and age <= 60");
        //过滤器 * 表示不过滤
        consumer.subscribe("hzw_topic_01", messageSelector);

        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                for (MessageExt msg : msgs){
                    System.out.println("收到消息: " + new String(msg.getBody()));
                }
                //默认情况下， 这条消息只会被一个消费者消费，消费到点对点
                //message状态被修改
                //ack
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
    }

}
