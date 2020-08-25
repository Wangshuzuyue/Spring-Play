package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;

/**
 * @author: huangzuwang
 * @date: 2019-07-23 18:04
 * @description: 服务发现接口
 */
public interface ServiceDiscovery {

    RegisterInfo discover(Class<?> serviceClass) throws Exception;

}
