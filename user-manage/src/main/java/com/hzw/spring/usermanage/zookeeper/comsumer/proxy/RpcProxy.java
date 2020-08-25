package com.hzw.spring.usermanage.zookeeper.comsumer.proxy;

import com.hzw.rpc.api.RpcRequest;
import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.zookeeper.comsumer.RegisterInfo;
import com.hzw.spring.usermanage.zookeeper.discovery.ServiceDiscovery;
import com.hzw.spring.usermanage.zookeeper.discovery.ServiceDiscoveryByZk;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-24 16:19
 * @Description:
 */
public class RpcProxy {

    public static <T> T create(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz}, new MethodProxy(clazz));
    }


    /**
     * 通过代理的形式，将本地调用转变成网络请求
     */
    public static class MethodProxy implements InvocationHandler {

        private Class<?> clazz;

        public MethodProxy(Class<?> clazz) {
            this.clazz = clazz;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (Object.class.equals(method.getDeclaringClass())) {
                //Proxy创建的代理类除了接口方法外，还有Object类方法；
                // 如果是Object的方法，直接调用，不用代理
                return method.invoke(proxy, args);
            } else {
                return rpcInvoke(proxy, method, args);
            }
        }

        /**
         * 1.获取Zookeeper上注册好的服务的IP和port
         * 发送网络请求
         *
         * @param proxy
         * @param method
         * @param args
         * @return
         */
        private Object rpcInvoke(Object proxy, Method method, Object[] args) throws Exception {

            ServiceDiscovery serviceDiscovery = new ServiceDiscoveryByZk();
            RegisterInfo registerInfo = serviceDiscovery.discover(UserService.class);

            //构造一个协议的内容
            RpcRequest msg = new RpcRequest();
            msg.setClassName(clazz.getName());
            msg.setMethodName(method.getName());
            msg.setPrames(method.getParameterTypes());
            msg.setValues(args);

            final RpcProxyHandler rpcProxyHandler = new RpcProxyHandler();

            //发起网络请求【Netty】
            EventLoopGroup workGroup = new NioEventLoopGroup();

            Bootstrap client = new Bootstrap();

            client.group(workGroup)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {


                            ChannelPipeline pipeline = socketChannel.pipeline();

                            //对于自定义协议的内容需要进行编、解码
                            pipeline.addLast(new LengthFieldBasedFrameDecoder
                                    (Integer.MAX_VALUE, 0, 4,
                                            0, 4));
                            //自定义编码器
                            pipeline.addLast(new LengthFieldPrepender(4));

                            //实参的处理 完成对数据的解析
                            pipeline.addLast("encoder", new ObjectEncoder());
                            pipeline.addLast("decoder",
                                    new ObjectDecoder(Integer.MAX_VALUE,
                                            ClassResolvers.cacheDisabled(null)));

                            //最后一步，执行属于自己的逻辑
                            //1、注册，给每一个对象起一个名字，对外服务的名字
                            //2、服务位置要做一个登记
                            pipeline.addLast(rpcProxyHandler);
                        }
                    });

            ChannelFuture future;
            try {
                future = client.connect(registerInfo.getIp(), registerInfo.getPort()).sync();
                future.channel().writeAndFlush(msg).sync();
                future.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (workGroup != null) {
                    workGroup.shutdownGracefully();
                }
            }
            return rpcProxyHandler.getResponse();
        }



    }
}
