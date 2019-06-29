package com.hzw.spring.usermanage.io.nio;

import com.hzw.spring.usermanage.io.bio.RequestHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/14 19:28
 * @Description:
 */
public class NIOServer {

    public static ServerSocketChannel serverSocketChannel = null;

    public static Selector selector = null;

    public static ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

    public static void main(String[] args) throws IOException {
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.configureBlocking(false);
        selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("NIOServer Started, Listening on port "
                + serverSocketChannel.getLocalAddress());

        listen();
    }

    /**
     * 不断循环监听channel状态的改变
     *
     * @throws IOException
     */
    public static void listen() throws IOException {
        while (true) {
            //select这个方法会一直阻塞到某个注册的通道有事件就绪。
            // 一旦这个方法返回，线程就可以处理这些事件，事件的例子有如新连接进来，数据接收等。
            int select = selector.select();
            if (select < 1) {
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();

                if (key.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel clientChannel = channel.accept();
                    System.out.println("Connection From " + clientChannel.getRemoteAddress());
                    clientChannel.configureBlocking(false);

                    //通过register改变channel要进行的操作
                    clientChannel.register(selector, SelectionKey.OP_READ);
                }

                if (key.isReadable()) {
                    //new Thread()
                    SocketChannel channel = (SocketChannel) key.channel();
                    try {
                        channel.read(byteBuffer);
                    }catch (IOException e){
                        System.out.println("客户端断开连接:" + e);
                    }
                    byteBuffer.flip();
                    if (byteBuffer.hasRemaining()){
                        String request = new String(byteBuffer.array()).trim();
                        byteBuffer.clear();
                        System.out.println("收到来自客户端 " + channel.getRemoteAddress()
                                + " 的信息:" + request);
                        RequestHandler requestHandler = new RequestHandler();
                        String response = requestHandler.handle(request);
                        key = channel.register(selector, SelectionKey.OP_WRITE);
                        key.attach(response);
                    }
                    byteBuffer.clear();
                }

                if (key.isWritable()) {
                    SocketChannel channel = (SocketChannel) key.channel();
                    String content = (String) key.attachment();
                    channel.write(ByteBuffer.wrap(content.getBytes()));
                    //没有这句则会死循环write
                    key.interestOps(SelectionKey.OP_READ);
                }
                iterator.remove();
            }
        }
    }
}
