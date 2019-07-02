package com.hzw.spring.usermanage.rpc;

import com.hzw.rpc.api.dto.UserIDto;
import com.hzw.rpc.api.service.HelloService;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/16 20:49
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        HelloService helloService = rpcProxyClient
                .clientProxy(HelloService.class, "localhost", 8888);
        System.out.println(helloService.hello("hzw11"));
        UserIDto userIDto = new UserIDto();
        userIDto.setName("hzw22");
        userIDto.setAge("26");
        System.out.println(helloService.save(userIDto));
    }
}
