package com.hzw.rocketmqplay.demo03;


import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-07-01 23:06
 * @description: 顺序消费
 */
public class Customer3 {

    public static void main(String[] args) throws Exception {
        //同一group下的Customer只会有一个消费消息
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("12321");
        //设置nameserver地址
        consumer.setNamesrvAddr("39.107.238.67:9876");
        //消费超时时间 单位分钟, 默认15分钟
        consumer.setConsumeTimeout(15);

        //每个customer关注一个topic
        //消息过滤器
        MessageSelector messageSelector = MessageSelector.bySql("age >= 18 and age <= 60");
        //过滤器 * 表示不过滤
        consumer.subscribe("hzw_topic_03", messageSelector);
        //MessageListenerConcurrently 并发消费【开启多个线程】
        //MessageListenerOrderly 对于一个Queue的消息顺序消费
        //最小开启消费线程数
//        consume r.setConsumeThreadMin(1);
        //最大开启消费线程数
//        consumer.setConsumeThreadMax(10);
        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                for (MessageExt msg : msgs){
                    System.out.println("收到消息: " + new String(msg.getBody()) + " 当前线程:" + Thread.currentThread().getName()
                            + " QueueId:" + msg.getQueueId());
                }
                //默认情况下， 这条消息只会被一个消费者消费，消费到点对点
                //message状态被修改
                //ack
                return ConsumeOrderlyStatus.SUCCESS;
            }
        });
        consumer.start();
    }

}
