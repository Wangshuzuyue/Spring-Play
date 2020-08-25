package com.hzw.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @author: huangzuwang
 * @date: 2019-08-08 11:38
 * @description:
 */
public class CuratorFrameworkConnection {
    public static CuratorFramework get(){
        CuratorFramework curatorFramework = org.apache.curator.framework.CuratorFrameworkFactory.builder()
                .connectString(ZkConfig.CONNECT_STRING)
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .build();
        curatorFramework.start();
        return curatorFramework;
    }
}
