package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.zookeeper.ZkConfig;
import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: huangzuwang
 * @date: 2019-07-23 18:05
 * @description: 发现Zookeeper 上注册的服务节点
 */
public class ServiceDiscoveryByZk implements ServiceDiscovery{

    CuratorFramework curatorFramework;

    {
        curatorFramework = CuratorFrameworkFactory.builder()
                .connectString(ZkConfig.CONNECT_STRING)
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .namespace(ZkConfig.NAMESPACE)
                .build();
        curatorFramework.start();
    }

    /**
     * 服务注册信息缓存
     * key 服务名称   value：服务注册信息
     */
    Map<Class<?>, List<RegisterInfo>> serviceMap = new ConcurrentHashMap<>(16);

    /**
     * 服务查找
     * 缓存服务信息
     * 注册监听
     * 负载均衡
     * @param serviceClass
     * @return
     * @throws Exception
     */
    @Override
    public RegisterInfo discover(Class<?> serviceClass) throws Exception {
        //查找缓存
        List<RegisterInfo> registerInfos = serviceMap.get(serviceClass);
        if (CollectionUtils.isEmpty(registerInfos)){
            String path = "/"+ZkConfig.NAMESPACE+"/" + serviceClass.getName();
            List<String> addresses = curatorFramework.getChildren().forPath(path);
            if (!CollectionUtils.isEmpty(addresses)){
                registerInfos = new ArrayList<>();
                for (String address : addresses){
                    String[] split = address.split(":");
                    RegisterInfo registerInfo = new RegisterInfo();
                    registerInfo.setIp(split[0]);
                    registerInfo.setPort(Integer.parseInt(split[1]));
                    registerInfos.add(registerInfo);
                }
                //缓存注册信息
                serviceMap.put(serviceClass, registerInfos);
            }
            //注册监听
            registerWatch(path);
        }

        //负载均衡
        LoadBalanceStrategy loadBalanceStrategy = new RandomLoadBalanceStrategy();
        return loadBalanceStrategy.selectHost(registerInfos);
    }

    //注册监听
    private void registerWatch(String path) throws Exception {
        //NodeCache 针对当前节点的变化触发事件
        //TreeCache 综合事件

        //针对子节点的创建更新删除 触发事件
        PathChildrenCache pathChildrenCache = new PathChildrenCache(curatorFramework,
                path, true);
        PathChildrenCacheListener listener = (curatorFramework, event) -> {
            System.out.println(" --> Path Children Change : " + event.getType());
            ChildData childData = event.getData();
            if (childData != null){
                System.out.println(" --> childData : " + childData.getPath());
                System.out.println(" --> childData.data : " + new String(childData.getData()));
            }else{
                System.out.println(" --> childData : null");
            }
            if (PathChildrenCacheEvent.Type.CHILD_ADDED == event.getType()){
                System.out.println("缓存新增的节点信息");
//                serviceMap.put()
            }
        };
        pathChildrenCache.getListenable().addListener(listener);
        pathChildrenCache.start(PathChildrenCache.StartMode.NORMAL);
    }


}
