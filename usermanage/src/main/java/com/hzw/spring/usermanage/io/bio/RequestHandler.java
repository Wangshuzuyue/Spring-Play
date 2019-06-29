package com.hzw.spring.usermanage.io.bio;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/13 18:12
 * @Description:
 */
public class RequestHandler {
   public String handle(String request){
        System.out.println("处理请求数据：" + request);
        return "好的，我知道了: " + request + "\r\n";
    }
}
