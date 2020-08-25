package com.hzw.zookeeper.lock;

import com.hzw.zookeeper.CuratorFrameworkConnection;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

/**
 * @author: huangzuwang
 * @date: 2019-08-07 15:21
 * @description: 分布式锁演示 课程 3.5.11
 */
public class LockDemo {
    public static void main(String[] args) {

        CuratorFramework curatorFramework = CuratorFrameworkConnection.get();

        InterProcessMutex lock = new InterProcessMutex(curatorFramework, "/lockTest");

        for (int i = 0; i < 5; i++){
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() +" ----> 尝试竞争锁");
                try {
                    //阻塞竞争锁
                    lock.acquire();
                    System.out.println();
                    System.out.println(Thread.currentThread().getName() +" ----> 成功获得锁");
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (lock != null){
                        try {
                            lock.release();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "Thread--" + i).start();
        }
    }
}
