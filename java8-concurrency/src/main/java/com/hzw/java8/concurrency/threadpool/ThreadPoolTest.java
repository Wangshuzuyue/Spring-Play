package com.hzw.java8.concurrency.threadpool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: huangzuwang
 * @date: 2020-03-23 15:44
 * @description:
 */
public class ThreadPoolTest {

    private static ThreadFactory threadFactory;

    private static ExecutorService executorService;

    static {
        threadFactory = new ThreadFactoryBuilder().setNameFormat("hzw-pool-%d").build();
        executorService = new ThreadPoolExecutor(8, 16,
                600L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000), threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());
    }



    public static void main(String[] args) {

        long startTime  = System.currentTimeMillis();

        List<Future<String>> taskList = new ArrayList<>();
        for (int i = 0; i < 2000; i++){
            int finalI = i;
            Callable<String> task = () -> {
                System.out.println("线程:" + Thread.currentThread().getName() + "执行 " + finalI);
                Thread.sleep(100L);
                return "你好我是第" + finalI;
            };
            executorService.execute(() -> System.out.println("123"));
            Future<String> submit = executorService.submit(task);
            taskList.add(submit);

            int u = 5 << 2;
        }

        for (Future<String> future : taskList){
            try {
                String result = future.get();
//                System.out.println("结果:" + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        long endTime  = System.currentTimeMillis();
        System.out.println("耗时:" + (endTime - startTime) + "ms");
        executorService.shutdown();
    }

}
