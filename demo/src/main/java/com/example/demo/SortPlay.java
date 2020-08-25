package com.example.demo;

import java.util.Arrays;

/**
 * @author: huangzuwang
 * @date: 2019-12-28 13:24
 * @description: 排序练习
 */
public class SortPlay {

    public static void main(String[] args) {
        bubbleSort();
//        selectionSort();
    }

    public static void bubbleSort(){
        int[] arr = new int[]{14, 19, 3, 8, 5, 7, 2, 4};
        for (int i = 0; i < arr.length; i++){
            int temp;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    //交换
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(){
        int[] arr = new int[]{14, 19, 3, 8, 5, 7, 2};
        for (int i = 0; i < arr.length; i++){
            int lowerIndex = i;
            int temp;
            for(int j = lowerIndex + 1; j < arr.length; j++){
                if (arr[j] < arr[lowerIndex]){
                    lowerIndex = j;
                }
                temp = arr[lowerIndex];
                arr[lowerIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
