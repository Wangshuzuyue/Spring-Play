package com.hzw.spring.usermanage.io.bio;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/13 18:12
 * @Description:
 */
public class ClientHandler implements Runnable{

    private Socket clientSocket;
    private RequestHandler requestHandler;

    public ClientHandler(Socket clientSocket, RequestHandler requestHandler) {
        this.clientSocket = clientSocket;
        this.requestHandler = requestHandler;
    }

    @Override
   public void run() {
        Scanner scanner;
        try {
            scanner = new Scanner(clientSocket.getInputStream());
            while (true) {
                //阻塞2：随时等待客户端发送数据
                String content = scanner.nextLine();
                if ("quit".equals(content)) {
                    break;
                }
                String response = requestHandler.handle(content);
                clientSocket.getOutputStream().write(response.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
