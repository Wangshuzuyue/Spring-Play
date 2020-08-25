package com.hzw.spring.usermanage.zookeeper.discovery;

import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;

import java.util.List;
import java.util.Random;

/**
 * @author: huangzuwang
 * @date: 2019-08-07 14:22
 * @description:
 */
public class RandomLoadBalanceStrategy extends AbstractLoadBalanceStrategy{

    @Override
    protected RegisterInfo doSelect(List<RegisterInfo> registerInfos) {
        int size = registerInfos.size();
        Random random = new Random();
        return registerInfos.get(random.nextInt(size));
    }
}
