package com.hzw.springboot.dubbo.client;

import com.hzw.springboot.api.dubbo.ISayHelloService;

/**
 * @author: huangzuwang
 * @date: 2019-07-30 17:57
 * @description:
 */

public class SayHelloServiceMock implements ISayHelloService {
    @Override
    public String sayHello(String name) {
        return "服务被降级，返回兜底数据";
    }
}
