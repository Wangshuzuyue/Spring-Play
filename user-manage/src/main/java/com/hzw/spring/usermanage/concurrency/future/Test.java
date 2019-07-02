package com.hzw.spring.usermanage.concurrency.future;

import java.util.concurrent.*;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/28 18:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = new ThreadPoolExecutor(5,50,
                200L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        CallableTask callableTask = new CallableTask();
        for (int i = 0; i < 10000; i++){
            Future<String> future = executorService.submit(callableTask);
            future.get();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(">>>>耗时:" + (endTime - startTime));
        executorService.shutdown();
    }
}
