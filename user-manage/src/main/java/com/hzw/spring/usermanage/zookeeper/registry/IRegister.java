package com.hzw.spring.usermanage.zookeeper.registry;

/**
 * @author: huangzuwang
 * @date: 2019-08-06 14:18
 * @description:
 */
public interface IRegister {

    /**
     * 注册中心
     * @param serviceName
     * @param serviceAddress
     * @return
     */
    void registry(String serviceName, String serviceAddress) throws Exception;
}
