package com.hzw.java8.concurrency.productandconsumer;

/**
 * @author: huangzuwang
 * @date: 2020-03-17 22:50
 * @description:
 */
public class TestProductAndConsumer {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk);
        Customer customer = new Customer(clerk);
        new Thread(productor, "生产者A").start();
        new Thread(customer, "消费者A").start();
        new Thread(productor, "生产者B").start();
        new Thread(customer, "消费者B").start();

    }

}

/**
 * 店员
 */
class Clerk {
    private int product = 0;

    //进货
    public synchronized void get() {
        while (product >= 10) {
            System.out.println("产品已满！");
            try {
                //停止生产
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("进货:" + Thread.currentThread().getName() + " : " + ++product);
        //通知可以进行消费了
        this.notifyAll();

    }

    //卖货
    public synchronized void sale() {
        while (product <= 0) {
            System.out.println("缺货！");
            try {
                //停止消费
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("卖货:" + Thread.currentThread().getName() + " : " + --product);
        //通知可以进行生产了
        this.notifyAll();

    }
}

/**
 * 生产者
 */
class Productor implements Runnable {

    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.get();
        }
    }
}

/**
 * 消费者
 */
class Customer implements Runnable {

    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.sale();
        }
    }
}

