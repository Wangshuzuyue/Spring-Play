package com.example.demo;

/**
 * @author: huangzuwang
 * @date: 2019-12-29 22:30
 * @description:
 */
class CloneTest implements Cloneable {
    int num;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest();
        ct.num = 666;
        System.out.println(ct.num);
        CloneTest ct2 = (CloneTest) ct.clone();
        System.out.println(ct2.num);





        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        threadLocal.set(null);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
//    public class CloneTest2 {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        CloneTest ct = new CloneTest();
//        ct.num = 666;
//        System.out.println(ct.num);
//        CloneTest ct2 = (CloneTest) ct.clone();
//        System.out.println(ct2.num);
//    }
//}
