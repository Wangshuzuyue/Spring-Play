package com.example.demo;

/**
 * @author: huangzuwang
 * @date: 2020-02-02 23:48
 * @description: 初始化 字节码文件查看
 */
public class InitPlay {

    private static int i = 1;

    static {
        i = 2;
        num = 20;
    }

    private int j;

    private static int num = 10;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(num);

        InitPlay initPlay = new InitPlay();
        initPlay.test();
        initPlay.test2();
    }

    public void test(){
        int itest = 100000;
        int jtest = 90000;
        int ztest = itest + jtest;
        System.out.println(ztest);
    }

    public void test2(){
        byte i = 15;
        int j = 8;
        int k = i + j;
//        int ztest = itest + jtest;
        System.out.println(k);
    }
}
