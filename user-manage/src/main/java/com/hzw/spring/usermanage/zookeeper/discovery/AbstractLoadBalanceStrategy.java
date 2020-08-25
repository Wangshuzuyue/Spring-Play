package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2019-08-07 14:19
 * @description:
 */
public abstract class AbstractLoadBalanceStrategy implements LoadBalanceStrategy{
    @Override
    public RegisterInfo selectHost(List<RegisterInfo> registerInfos) {
        if (CollectionUtils.isEmpty(registerInfos)){
            return null;
        }
        if (registerInfos.size() == 1){
            return registerInfos.get(0);
        }
        return doSelect(registerInfos);
    }

    /**
     * 负载均衡实现算法
     * @param registerInfos
     * @return
     */
    protected abstract RegisterInfo doSelect(List<RegisterInfo> registerInfos);
}
