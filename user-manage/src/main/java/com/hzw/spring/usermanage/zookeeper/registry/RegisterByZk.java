package com.hzw.spring.usermanage.zookeeper.registry;

import com.hzw.spring.usermanage.zookeeper.ZkConfig;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-08-06 14:43
 * @description:
 */
public class RegisterByZk implements IRegister{

    private CuratorFramework curatorFramework;

    public RegisterByZk() {
        connectZookeeper();
    }

    /**
     * 注册
     * 即创建节点
     * @param serviceName
     * @param serviceAddress
     * @return
     * @throws IOException
     */
    @Override
    public void registry(String serviceName, String serviceAddress) throws Exception {
        String servicePath = ZkConfig.NAMESPACE + "/" + serviceName;
        if (curatorFramework.checkExists().forPath(servicePath) == null){
            //节点不存在
            curatorFramework.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.PERSISTENT)
                    .forPath(servicePath);
        }
        //serviceAddress ip:port
        String addressPath = servicePath + "/" + serviceAddress;
        curatorFramework.create().withMode(CreateMode.EPHEMERAL).forPath(addressPath);
    }

    private void connectZookeeper() {
        curatorFramework = CuratorFrameworkFactory.builder()
                .connectString(ZkConfig.CONNECT_STRING)
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .namespace(ZkConfig.NAMESPACE)
                .build();
        curatorFramework.start();
    }
}
