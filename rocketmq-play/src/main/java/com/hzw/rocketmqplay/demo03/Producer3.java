package com.hzw.rocketmqplay.demo03;


import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.selector.SelectMessageQueueByHash;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-07-01 23:06
 * @description: 顺序发送
 */
public class Producer3 {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("hzw_01_producer");
        //设置nameserver地址
        producer.setNamesrvAddr("39.107.238.67:9876");
        producer.setVipChannelEnabled(false);
        //同步发送时 重试次数，默认
        producer.setRetryTimesWhenSendFailed(2);
        //异步发送时 重试次数，默认2
//        producer.setRetryTimesWhenSendAsyncFailed(2);
        //超时时间 默认3000, 单位毫秒？
        producer.setSendMsgTimeout(3000);
        //是否向其他broker发送请求 默认false
//        producer.setRetryAnotherBrokerWhenNotStoreOK(true);
        producer.start();

        //自定义队列选择器【保证顺序消费的关键】
        MessageQueueSelector queueSelector = new MessageQueueSelector() {

            /**
             * 手动选择一个Queue
             * @param mqs 当前包含的所有Queue
             * @param msg 具体消息
             * @param arg 自定义参数【对应send的 Object arg】
             * @return
             */
            @Override
            public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                System.out.println("MessageQueue Select arg: " + arg);
                //向固定的一个Queue写消息
                MessageQueue messageQueue = mqs.get((Integer) arg);
                return messageQueue;
            }
        };
        //根据arg的hashCode决定选哪个Queue发送
        queueSelector = new SelectMessageQueueByHash();
        //随机选择
//        queueSelector = new SelectMessageQueueByRandom();
        //根据机房【阿里内部使用】，没有实现，可以自己实现
//        queueSelector = new SelectMessageQueueByMachineRoom();
        Integer flag = 1;
        for (int i = 1; i <= 100; i++){
            // topic为消息将要发送的地址
            Message msg = new Message("hzw_topic_03", ("hzwzzzz~~~" + i).getBytes());
            msg.putUserProperty("age", i + "");
            //同步
            SendResult sendResult = producer.send(msg, queueSelector, flag);
            System.out.println("sendResult: " + sendResult);
        }

//        producer.shutdown();
    }

}
