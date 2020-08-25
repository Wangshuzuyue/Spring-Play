package com.example.demo;

import java.util.Arrays;

/**
 * @author: huangzuwang
 * @date: 2019-12-28 13:08
 * @description:
 */
public class SortDemo {

    public static void main(String[] args) {
        //冒泡排序
        bubbleSort();

        //选择排序
        selectionSort();
    }

    /**
     * 冒泡排序
     *
     * 依次比较相邻的两个数，把较大的值放后面，执行整个循环之后，数组就从小到大进行排列了
     * @author: huangzuwang
     * @date: 2019-12-28 13:10
     * @param
     * @return
     **/
    public static void bubbleSort(){
        int[] arr = {2, 8, 13, 11, 6, 7};
        System.out.println("排序前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            // 因为冒泡是把每轮循环中较大的数飘到后面，所以是 arr.length-i-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 元素交换
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    /**
     * 选择排序
     *
     * 每次从待排序的数据元素中选出最小（或最大）的一个元素，
     * 顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。
     * @author: huangzuwang
     * @date: 2019-12-28 13:14
     * @param
     * @return
     **/
    public static void selectionSort(){
        int[] arr = {2, 8, 13, 11, 6, 7};
        System.out.println("排序前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int lowerIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 找出最小的一个索引
                if (arr[j] < arr[lowerIndex]) {
                    lowerIndex = j;
                }
            }
            // 交换
            int temp = arr[i];
            arr[i] = arr[lowerIndex];
            arr[lowerIndex] = temp;
        }
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
