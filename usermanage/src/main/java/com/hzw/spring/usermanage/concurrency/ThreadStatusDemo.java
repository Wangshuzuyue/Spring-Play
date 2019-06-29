package com.hzw.spring.usermanage.concurrency;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/15 18:43
 * @Description:
 */
public class ThreadStatusDemo extends Thread{
    public static void main(String[] args) {
        new Thread(new ThreadStatusDemo(), "Thread--------hzw--------001").start();
        new Thread(new Thread(){
            @Override
            public void run() {
                synchronized (ThreadStatusDemo.class){
                    try {
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }, "Thread--------hzw--------002").start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(15000);
                System.out.println(">>>>>");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
