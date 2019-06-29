package com.hzw.spring.usermanage.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/13 15:58
 * @Description:
 */
public class ServerSocketDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server Started" + serverSocket.getLocalSocketAddress());
        while (true){
            //阻塞1： 随时等待客户端连接
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection from " + clientSocket.getRemoteSocketAddress());
            Scanner scanner = new Scanner(clientSocket.getInputStream());
            while (true){
                //阻塞2：随时等待客户端发送数据
                String content = scanner.nextLine();
                if ("quit".equals(content)){
                    break;
                }
                System.out.println("客户端发送内容: " + content);
                String response = "好的，我知道了: " + content + "\r\n";
                clientSocket.getOutputStream().write(response.getBytes());
                clientSocket.getOutputStream().flush();
            }
        }
    }
}
