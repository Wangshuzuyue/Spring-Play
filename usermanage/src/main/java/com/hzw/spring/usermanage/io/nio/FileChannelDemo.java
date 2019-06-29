package com.hzw.spring.usermanage.io.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-28 10:39
 * @Description:
 */
public class FileChannelDemo {

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("fileChannel.txt","rw");
        ByteBuffer byteBuffer = ByteBuffer.allocate(128);
        RandomAccessFile file1 = new RandomAccessFile("fileChannel-1.txt","rw");
        FileChannel channel = file.getChannel();
        System.out.println("文件大小:" + channel.size());
        FileChannel channel1 = file1.getChannel();
        while (channel.read(byteBuffer) != -1){
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()){
//                System.out.println((byteBuffer.get()));
                channel1.write(byteBuffer);
            }
            byteBuffer.clear();
        }
        channel.close();
        channel1.force(true);
        channel1.close();
        file.close();
        file1.close();

    }

}
