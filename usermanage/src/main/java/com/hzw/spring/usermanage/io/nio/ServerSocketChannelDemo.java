package com.hzw.spring.usermanage.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-28 11:27
 * @Description:
 */
public class ServerSocketChannelDemo {
    public static void main(String[] args) throws IOException {

        //ServerSocketChannel 是一个可以监听新进来的TCP连接的通道, 就像标准IO中的ServerSocket一样
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        serverSocketChannel.bind(new InetSocketAddress(8081));
        serverSocketChannel.configureBlocking(false);
        while (true){
            SocketChannel client = serverSocketChannel.accept();
            //在非阻塞模式下，accept() 方法会立刻返回，如果还没有新进来的连接,返回的将是null。
            // 因此，需要检查返回的SocketChannel是否是null.
            if (client != null){
                System.out.println("客户端连接:" + client.getRemoteAddress());



            }
        }




//        serverSocketChannel.close();
    }
}
