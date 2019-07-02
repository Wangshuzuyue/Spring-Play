package com.hzw.spring.usermanage.mytomcat;

/**
 * @Auther: huangzuwang
 * @Date: 2019-06-24 00:08
 * @Description:
 */
public class MyTomcat {

    //1、配置好启动端口

    //2、配字web.xml
    // servlet-name
    // servlet-class
    // url-pattern

    //3、读取配置，url-pattern 和servlet建议一个映射关系
    // Map servletMapping

    //4、HTTP请求，发送的数据就是字符串，有规律的字符串【HTTP协议】

    //5、从协议内容中拿到URL，把相应的Servlet用反射进行实例化

    //6、调用实例化对象的service()方法，执行doGet/doPost方式

    //7、Request（InputStream） 和 Response（OutputStream）

    public static void main(String[] args) {

    }
}
