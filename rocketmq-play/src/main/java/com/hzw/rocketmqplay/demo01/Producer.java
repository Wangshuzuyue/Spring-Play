package com.hzw.rocketmqplay.demo01;


import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @author: huangzuwang
 * @date: 2020-07-01 23:06
 * @description:
 */
public class Producer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("hzw_01_producer");
        //设置nameserver地址
        producer.setNamesrvAddr("39.107.238.67:9876");
        producer.setVipChannelEnabled(false);
        //同步发送时 重试次数，默认
        producer.setRetryTimesWhenSendFailed(2);
        //异步发送时 重试次数，默认2
        producer.setRetryTimesWhenSendAsyncFailed(2);
        //超时时间 默认3000, 单位毫秒？
        producer.setSendMsgTimeout(3000);
        //是否向其他broker发送请求 默认false
        producer.setRetryAnotherBrokerWhenNotStoreOK(true);
        producer.start();

        // topic为消息将要发送的地址
        // 具体数据
        for (int i = 1; i <= 100; i++){
            Message msg = new Message("hzw_topic_01", ("hzwzzzz~~~" + i).getBytes());
            msg.putUserProperty("age", i + "");
            //同步
            SendResult sendResult = producer.send(msg);

////            异步
//             producer.send(msg, new SendCallback(){
//                @Override
//                public void onSuccess(SendResult sendResult) {
//
//                }
//                @Override
//                public void onException(Throwable throwable) {
//
//                }
//            });
//
//            //单向消息【只管发送，不关心结果】
//            producer.sendOneway(msg);

            System.out.println("sendResult: " + sendResult);
        }

//        producer.shutdown();
    }

}
