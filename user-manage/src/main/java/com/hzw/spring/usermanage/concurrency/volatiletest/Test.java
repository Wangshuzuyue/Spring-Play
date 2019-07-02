package com.hzw.spring.usermanage.concurrency.volatiletest;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/31 11:48
 * @Description: Java并发编程的一束 第三章 3.1.4
 */
public class Test {
    private static int a = 0;
    private static int b = 0;
    public static void main(String[] args) throws InterruptedException {
        RunnableA runnableA = new RunnableA();
        RunnableB runnableB = new RunnableB();
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

        // 这里处理器A和处理器B可以同时把共享变量写入自己的写缓冲区(A1，B1)，
        // 然后从内存中读取另一个共享变量(A2，B2)，
        // 最后才把自己写缓存区中保存的脏数据刷新到内存中(A3， B3)。
        // 当以这种时序执行时，程序就可以得到x=y=0的结果。
    }

    static class RunnableA implements Runnable{


        @Override
        public void run() {
            //A1 【写操作】
            a = 1;

            //A2 【读操作】
            int x = b;
            System.out.println("x=" + x);
        }
    }

    static class RunnableB implements Runnable{


        @Override
        public void run() {
            //B1 【写操作】
            b = 2;

            //B2 【读操作】
            int y = a;
            System.out.println("y=" + y);
        }
    }
}
