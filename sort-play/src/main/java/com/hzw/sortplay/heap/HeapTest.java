package com.hzw.sortplay.heap;

/**
 * @description: 堆排序
 * @author: huangzuwang
 * @date: 2020-06-26 19:11
 **/
public class HeapTest {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.push(5);
        heap.push(10);
        heap.push(3);
        heap.push(6);
        heap.push(10);
        heap.push(33);
        heap.push(8);
        heap.push(14);
        heap.push(11);
        heap.push(20);
//        heap.push(26);
        int size = heap.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(heap.pop());
        }
    }

}
