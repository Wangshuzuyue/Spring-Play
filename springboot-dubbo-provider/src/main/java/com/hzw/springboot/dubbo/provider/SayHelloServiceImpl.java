package com.hzw.springboot.dubbo.provider;

import com.hzw.springboot.api.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: huangzuwang
 * @date: 2019-07-29 18:38
 * @description: loadbalance: 负载均衡
 * 默认 random 随机
 * roundrobin 轮询
 *
 * weight 权重
 */

@Service(loadbalance = "roundrobin",
        weight = 9,
        timeout = 50000,
        cluster = "failsafe")
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println(">>> SayHelloServiceImpl : " + name);
        return ">>> hello " + name;
    }
}
