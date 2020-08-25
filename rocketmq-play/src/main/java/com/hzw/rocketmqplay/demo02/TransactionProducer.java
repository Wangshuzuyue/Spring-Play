package com.hzw.rocketmqplay.demo02;


import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * @author: huangzuwang
 * @date: 2020-07-01 23:06
 * @description: 事务消息生产者
 */
public class TransactionProducer {

    public static void main(String[] args) throws Exception {
        TransactionMQProducer producer = new TransactionMQProducer("hzw_01_producer");
        //设置nameserver地址
        producer.setNamesrvAddr("39.107.238.67:9876");


        producer.setTransactionListener(new TransactionListener() {

            //半消息发送成功后，触发此方法
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {
                try {
                    //执行本地事务【同步执行】
                    System.out.println("----------executeLocalTransaction 执行本地事务:");
                    System.out.println("----------message body:" + new String(message.getBody()));
                    System.out.println("----------transactionId:" + message.getTransactionId());
                }catch (Exception e){
                    return LocalTransactionState.ROLLBACK_MESSAGE;
                }

                return LocalTransactionState.COMMIT_MESSAGE;
//                return LocalTransactionState.UNKNOW;
                //失败
//                return LocalTransactionState.ROLLBACK_MESSAGE;
            }

            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
                //Broker回调, 检查本地事务
                //当executeLocalTransaction 在指定时间内未提交或回滚，Broker会调用
                System.out.println("----------checkLocalTransaction Broker回调:");

                //成功
//                return LocalTransactionState.COMMIT_MESSAGE;
                //等会儿
                return LocalTransactionState.UNKNOW;
                //失败
//                return LocalTransactionState.ROLLBACK_MESSAGE;
            }
        });
        producer.start();

        //发事务消息
        Message message = new Message("hzw_02_producer", "事务消息1".getBytes());
        TransactionSendResult sendResult = producer.sendMessageInTransaction(
                message, null);
        //阻塞，执行本地事务executeLocalTransaction结束后继续
        System.out.println("TransactionProducer sendResult: " + sendResult);

//        producer.shutdown();
    }

}
