package com.hzw.spring.usermanage.rpc;


import com.hzw.rpc.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-23 13:40
 * @Description:
 */
public class RemoteInvocationHandler implements InvocationHandler {

    private String host;

    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invocationHandler : come in");
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        Class [] clazzArray = new Class[args.length];
        for (int i = 0; i < args.length; i++){
            clazzArray[i] = args[i].getClass();
        }
        rpcRequest.setPrames(clazzArray);
        rpcRequest.setValues(args);
        RpcNetTansport netTansport = new RpcNetTansport(host, port);
        return netTansport.send(rpcRequest);
    }
}
