package com.hzw.spring.usermanage.concurrency;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/11 20:03
 * @Description:
 */
public class Test implements Runnable{
    /**
     * 中断标志
     */
    private volatile boolean isRunning = false;

    @Override
    public void run() {
        while (!isRunning){
            synchronized (Test.class){

            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread();


        thread.interrupt(); //isRunning = true;
    }


}
