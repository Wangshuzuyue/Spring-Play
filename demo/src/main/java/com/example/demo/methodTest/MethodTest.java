package com.example.demo.methodTest;

/**
 * @author: huangzuwang
 * @date: 2019-12-29 22:09
 * @description:
 */
public class MethodTest {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        B bc = new C();

        a.m(b);
        a.m(c);
        a.m(bc);
    }





}
