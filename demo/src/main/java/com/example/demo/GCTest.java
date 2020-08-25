package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2020-04-12 00:19
 * @description:
 */
public class GCTest {

    private static List<SortDemo> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true){
            list.add(new SortDemo());
            Thread.sleep(1L);
            System.out.println(++i);
        }
    }

}
