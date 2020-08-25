package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2019-08-07 14:18
 * @description: 负载均衡策略接口 课程3.5.9
 */
public interface LoadBalanceStrategy {

    RegisterInfo selectHost(List<RegisterInfo> registerInfos);
}
