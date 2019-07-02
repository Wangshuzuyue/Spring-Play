package com.hzw.spring.usermanage.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/13 15:58
 * @Description:
 */
public class ServerSocketThreadPoolDemo {

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = new ThreadPoolExecutor(1,3,
                200L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        RequestHandler requestHandler = new RequestHandler();

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server Started" + serverSocket.getLocalSocketAddress());
        while (true){
            //阻塞1： 随时等待客户端连接【此处阻塞，避免不了。因为服务端需一直等待，随时准备接收客户端请求】
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection from " + clientSocket.getRemoteSocketAddress());
            //非阻塞2：将处理任务派给一个线程做，然后继续阻塞1等待，但使用中的总线程数达到最大时也会阻塞
            executorService.submit(new ClientHandler(clientSocket, requestHandler));
            }
    }
}
