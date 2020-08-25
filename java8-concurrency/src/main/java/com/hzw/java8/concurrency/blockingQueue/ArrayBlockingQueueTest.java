package com.hzw.java8.concurrency.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: huangzuwang
 * @date: 2020-04-01 21:39
 * @description:
 */
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        Integer i = 10;
        BlockingQueue<Object> queue = new ArrayBlockingQueue<>(16);
        queue.add(i);
        queue.offer(i);

        try {
            queue.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        queue.remove(i);
        queue.poll();

        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AtomicInteger ai = new AtomicInteger(1);
        ai.getAndIncrement();
    }
    
}
