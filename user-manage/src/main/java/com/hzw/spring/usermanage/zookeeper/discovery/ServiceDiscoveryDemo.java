package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;

/**
 * @author: huangzuwang
 * @date: 2019-08-05 16:59
 * @description:
 */
public class ServiceDiscoveryDemo {

    public static void main(String[] args) throws Exception {

        ServiceDiscovery serviceDiscovery = new ServiceDiscoveryByZk();
        RegisterInfo discover = serviceDiscovery.discover(UserService.class);

    }
}
