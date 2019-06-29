package com.hzw.spring.usermanage.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-28 11:27
 * @Description:
 */
public class SocketChannelDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("localhost",8080));
        while (!socketChannel.finishConnect()){
            System.out.println("连接未建立");
        }

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.clear();
        byteBuffer.put("client data 112233".getBytes());
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()){
            socketChannel.write(byteBuffer);
        }

    }
}
