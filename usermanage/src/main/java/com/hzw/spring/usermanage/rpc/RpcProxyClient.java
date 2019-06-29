package com.hzw.spring.usermanage.rpc;

import java.lang.reflect.Proxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-23 13:38
 * @Description:
 */
public class RpcProxyClient {

    public <T> T clientProxy(final  Class<T> interfaceCls, final String host, final int port){

        return (T)Proxy.newProxyInstance(interfaceCls.getClassLoader(),
                new Class<?>[]{interfaceCls}, new RemoteInvocationHandler(host, port));

    }
}
