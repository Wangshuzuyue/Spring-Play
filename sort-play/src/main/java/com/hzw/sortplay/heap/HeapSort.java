package com.hzw.sortplay.heap;

/**
 * @description: 堆排序
 * @author: huangzuwang
 * @date: 2020-06-26 19:11
 **/
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4};
        Heap heap = new Heap(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(heap.pop());
        }
    }
}
