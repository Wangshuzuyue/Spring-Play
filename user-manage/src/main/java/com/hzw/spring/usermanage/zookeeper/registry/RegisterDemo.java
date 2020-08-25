package com.hzw.spring.usermanage.zookeeper.registry;

/**
 * @author: huangzuwang
 * @date: 2019-08-07 14:42
 * @description:
 */
public class RegisterDemo {
    public static void main(String[] args) {
        IRegister register = new RegisterByZk();
//        register.registry(UserService.class.getName(),);
    }
}
