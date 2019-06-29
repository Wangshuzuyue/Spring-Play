package com.hzw.spring.usermanage.concurrency.future;

import java.util.concurrent.Callable;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/28 18:42
 * @Description:
 */
public class CallableTask implements Callable<String>{

    @Override
    public String call() throws Exception {
        String result = "CallableTask: " + Thread.currentThread().getName();
        System.out.println(result);
        Thread.sleep(2);
        return result;
    }
}
