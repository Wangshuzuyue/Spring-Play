package com.hzw.spring.usermanage.zookeeper.comsumer;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-24 16:12
 * @Description: 课程：19期 3.4.6
 */
@Component
public class RpcConsumer {



    private CuratorFramework curatorFramework;

    private ApplicationContext applicationContext;

    public RpcConsumer() throws Exception {

        connectZookeeper();

        RegisterInfo registerInfo = getServiceLocation();

    }

    private void connectZookeeper() throws Exception {

    }

    private RegisterInfo getServiceLocation(){
        //TODO 获取已注册的目标Service地址

        return null;
    }

}
