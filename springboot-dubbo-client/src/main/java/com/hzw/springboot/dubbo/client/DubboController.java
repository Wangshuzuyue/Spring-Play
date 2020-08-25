package com.hzw.springboot.dubbo.client;

import com.hzw.springboot.api.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangzuwang
 * @date: 2019-07-30 15:23
 * @description:
 */
@RestController
public class DubboController {

    @Reference(loadbalance = "roundrobin",
            timeout = 1,
            cluster = "failfast",
            mock = "com.hzw.springboot.dubbo.client.SayHelloServiceMock")
    ISayHelloService sayHelloService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        System.out.println(">>>>> DubboController : " + name);
        return sayHelloService.sayHello(name);
    }
}
