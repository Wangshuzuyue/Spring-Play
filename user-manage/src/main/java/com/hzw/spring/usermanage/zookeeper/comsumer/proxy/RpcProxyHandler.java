package com.hzw.spring.usermanage.zookeeper.comsumer.proxy;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-24 16:39
 * @Description:
 */
public class RpcProxyHandler extends ChannelInboundHandlerAdapter {

    private Object response;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        this.response = msg;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        System.out.println(">>>> client is exception");
    }

    public Object getResponse() {
        return response;
    }
}
