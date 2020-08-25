package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: huangzuwang
 * @date: 2020-06-01 11:41
 * @description: 无锁写法
 */
public class A1B2C3 {

    private static String[] str1 = new String[]{"A","B","C","D","E","F"};
    private static String[] str2 = new String[]{"1","2","3","4","5","6"};

    private static AtomicInteger sum = new AtomicInteger(0);


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < str1.length; i++){
                while (true){
                    if (sum.get() % 2 == 0){
                        System.out.print(str1[i]);
                        sum.incrementAndGet();
                        break;
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < str2.length; i++){
                while (true){
                    if (sum.get() % 2 == 1){
                        System.out.print(str2[i]);
                        sum.incrementAndGet();
                        break;
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
