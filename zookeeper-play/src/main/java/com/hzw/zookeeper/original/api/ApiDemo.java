package com.hzw.zookeeper.original.api;

import com.hzw.zookeeper.ZkConfig;
import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-08-11 22:13
 * @description:
 */
public class ApiDemo implements Watcher {

    private static ZooKeeper zooKeeper;
    private static String path = "/watcherTest";

        static {
        try {
            zooKeeper = new ZooKeeper(ZkConfig.CONNECT_STRING,
                    5000, new ApiDemo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {


        if (zooKeeper.exists(path, false) == null){
            zooKeeper.create(path, "123".getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        Thread.sleep(3000);
        zooKeeper.exists(path, true);
        System.in.read();
    }

    @Override
    public void process(WatchedEvent event) {
        System.out.println(">>>>>>收到事件: " + event.getType());
        if (event.getType() == Event.EventType.NodeDataChanged){

            try {
                //循环监听
                zooKeeper.exists(path, true);
            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
