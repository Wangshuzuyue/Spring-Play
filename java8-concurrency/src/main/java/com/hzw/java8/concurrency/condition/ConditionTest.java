package com.hzw.java8.concurrency.condition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: huangzuwang
 * @date: 2020-03-27 23:01
 * @description:
 */
public class ConditionTest {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(new TaskAwait(lock, condition)).start();
        new Thread(new TaskSignal(lock, condition)).start();
    }

    static class TaskAwait implements Runnable{

        private Lock lock;
        private Condition condition;

        public TaskAwait(Lock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        @Override
        public void run() {
            try {
                lock.lock();
                condition.await();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    static class TaskSignal implements Runnable{

        private Lock lock;

        private Condition condition;

        public TaskSignal(Lock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
            // TODO HashMap Test
            Map<Object, Object> hashMap = new ConcurrentHashMap<>();
            for (int i = 0; i < 100; i++){
                hashMap.put("123-" + i, 123);
            }
            hashMap.size();
            // TODO HashMap Test
            int NCPU = 8;
            int n = 1024;
            long stride = (NCPU > 1) ? (n >>> 3) / NCPU : n;
            System.out.println("stride : " + stride);
        }

        @Override
        public void run() {
            try {
                lock.lock();
                condition.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
