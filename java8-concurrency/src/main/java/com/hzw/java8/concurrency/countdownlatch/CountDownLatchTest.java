package com.hzw.java8.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author: huangzuwang
 * @date: 2020-03-12 17:54
 * @description:
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(5);
        MyTask task = new MyTask(latch);
        new Thread(task).start();
        latch.await();
    }

    static class MyTask implements Runnable{

        private CountDownLatch latch;

        public MyTask(CountDownLatch countDownLatch) {
            this.latch = countDownLatch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100000; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                    latch.countDown();
                }
            }
        }
    }
}
