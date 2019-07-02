package com.hzw.spring.usermanage.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-23 22:23
 * @Description:
 */
public class BIOClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        OutputStream outputStream = socket.getOutputStream();
        String content = "aaaa111";
        System.out.println("客户端发送数据：" + content);
        outputStream.write(content.getBytes());
        outputStream.flush();

        InputStream inputStream = socket.getInputStream();

        byte[] buffer = new byte[1024];
        inputStream.read(buffer);
        String res = new String(buffer);
        System.out.println("客户端接收到 服务端返回：" + res);

        outputStream.close();
        socket.close();
    }
}
