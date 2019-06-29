package com.hzw.spring.usermanage.rpc;

import com.hzw.rpc.api.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-23 13:50
 * @Description:
 */
public class RpcNetTansport {
    private String host;

    private int port;

    public RpcNetTansport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Object send(RpcRequest rpcRequest){
        Socket socket = null;
        Object result = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            //建立连接
            socket = new Socket(host, port);

            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            //序列化
            objectOutputStream.writeObject(rpcRequest);
            objectOutputStream.flush();

            objectInputStream = new ObjectInputStream(socket.getInputStream());
            result = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
