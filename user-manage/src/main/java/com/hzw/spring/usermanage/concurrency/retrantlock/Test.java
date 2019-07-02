package com.hzw.spring.usermanage.concurrency.retrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/11 20:09
 * @Description:
 */
public class Test {

    int a = 0;
    ReentrantLock lock = new ReentrantLock();

    public void writer(){
        lock.lock();
        try {
            a++;
        }finally {
            lock.unlock();
        }
    }

    public void reader(){
        lock.lock();
        try {
            int i = a;
            System.out.println(">>>>a:" + a);
        }finally {
            lock.unlock();
        }
    }
}
