package com.hzw.spring.usermanage.concurrency.volatiletest;

/**
 * @Auther: huangzuwang
 * @Date: 2019/5/31 15:59
 * @Description: Java并发编程的一束 第三章 3.2.4
 */
public class ReorderExcample {

    static int a = 0;

    static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Writer writer = new Writer();
        Reader reader = new Reader();
        Thread tWriter = new Thread(writer);
        Thread tReader = new Thread(reader);
        tWriter.start();
        tReader.start();
        tWriter.join();
        tReader.join();
        // flag变量是个标记，用来标识变量a是否已被写入。
        // 这里假设有两个线程A和B，
        // A首先执行 writer()方法，随后B线程接着执行reader()方法。
        // 线程B在执行操作4时，能否看到线程A在操作 1对共享变量a的写入呢?

        // 答案是:不一定能看到。
    }


    static class Writer implements Runnable{


        @Override
        public void run() {
            //1
            a = 1;

            //2
            flag = true;
        }
    }

    static class Reader implements Runnable{


        @Override
        public void run() {
            //3
            if (flag){

                //4
                int i = a * a;
                System.out.println(">>>>> i: " + i);
            }
            // 在程序中，操作3和操作4存在控制依赖关系。
            // 当代码中存在控制依赖性时，会影响指令序列 执行的并行度。
            // 为此，编译器和处理器会采用猜测(Speculation)执行来克服控制相关性对并行度的影响。
            // 以处理器的猜测执行为例，执行线程B的处理器可以提前读取并计算a*a，
            // 然后把计算结果临时保存到一个名为重排序缓冲(Reorder Buffer，ROB)的硬件缓存中。
            // 当操作3的条件判 断为真时，就把该计算结果写入变量i中。
            // 此时就会影响最终计算结果
        }
    }
}
