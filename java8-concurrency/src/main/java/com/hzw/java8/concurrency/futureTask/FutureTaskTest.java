package com.hzw.java8.concurrency.futureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: huangzuwang
 * @date: 2020-04-03 22:35
 * @description:
 */
public class FutureTaskTest {

    public static void main(String[] args) {

        Callable<Integer> callable = () -> {
            System.out.println(Thread.currentThread().getName() + "----------hzw-----------");
            return 1;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        try {
            Integer result = futureTask.get();
            System.out.println("--------result:" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
