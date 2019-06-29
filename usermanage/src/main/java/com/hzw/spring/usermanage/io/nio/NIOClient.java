package com.hzw.spring.usermanage.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-23 22:22
 * @Description:
 */
public class NIOClient {

    private static ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

    private final static InetSocketAddress socketAddress =
            new InetSocketAddress("localhost",8080);

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        socketChannel.connect(socketAddress);

        while (true){
            int select = selector.select();
            if (select > 0){
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    if (key.isConnectable()){
                        System.out.println("client connect");
                        SocketChannel channel = (SocketChannel) key.channel();
                        if (channel.isConnectionPending()){
                            channel.finishConnect();
                            System.out.println("客户端完成连接");
//                            byteBuffer.clear();
//                            byteBuffer.put("hhhhhhhh".getBytes());
//                            channel.write(byteBuffer);
                            channel.register(selector, SelectionKey.OP_WRITE);
                        }
                    }

                    if (key.isReadable()){
                        SocketChannel channel = (SocketChannel) key.channel();
                        byteBuffer.clear();
                        int count = channel.read(byteBuffer);
                        if (count > 0){
                            String response = new String(byteBuffer.array(),0,count);
                            System.out.println("客户端收到返回：" + response);
                            channel.register(selector, SelectionKey.OP_WRITE);
                        }
                    }

                    if (key.isWritable()){
                        byteBuffer.clear();
                        SocketChannel channel = (SocketChannel) key.channel();
                        String request = "cccccc";
                        byteBuffer.put(request.getBytes());
                        byteBuffer.flip();
                        channel.write(byteBuffer);
                        System.out.println("客户端发送数据：" + request);
                        channel.register(selector, SelectionKey.OP_READ);
                    }
                }
            }
        }

    }
}
