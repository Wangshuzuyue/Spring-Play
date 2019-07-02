package com.hzw.spring.usermanage.controller;

import java.util.Objects;

/**
 * Created by huangzuwang on 18/2/1.
 */
public class MainTest {

    public static void main(String[] args){

        Integer x = 127;
        Integer y = 127;

        System.out.println("x == y : " + (x == y));

        Integer a = 128;
        Integer b = 128;

        System.out.println("a == b : " + (a == b));

        Integer c = new Integer(127);
        Integer d = new Integer(127);

        System.out.println("c == d : " + (c == d));


        Integer c1 = new Integer(127);
        Integer d1 = new Integer(127);

        System.out.println("c1 == d1 : " + Objects.equals(c1,d1));

        Integer e = new Integer(128);
        int f = 128;

        System.out.println("e == f : " + (e == f));

        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1 = str2 :" + (str1 == str2));
//        System.out.println("str1 = str2 :" + str1 == str2);

    }

}
