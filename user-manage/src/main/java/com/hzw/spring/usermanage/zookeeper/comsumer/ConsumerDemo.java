package com.hzw.spring.usermanage.zookeeper.comsumer;

import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.zookeeper.comsumer.proxy.RpcProxy;

/**
 * @author: huangzuwang
 * @date: 2019-08-05 16:59
 * @description:
 */
public class ConsumerDemo {

    public static void main(String[] args) throws Exception {


        UserService userService = RpcProxy.create(UserService.class);
    }
}
