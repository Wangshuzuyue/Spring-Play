package com.hzw.java8.concurrency;

import java.util.concurrent.RecursiveAction;

/**
 * @author: huangzuwang
 * @date: 2019-10-05 14:23
 * @description:
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.join();

        RecursiveAction action = new RecursiveAction() {
            @Override
            protected void compute() {
            }
        };
        action.join();

//        CompletableFuture.runAsync()
    }
}
