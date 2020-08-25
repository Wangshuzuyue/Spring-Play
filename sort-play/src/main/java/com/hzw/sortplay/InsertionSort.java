package com.hzw.sortplay;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 插入排序【先局部有序】
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4};
        sort2(arr);
        SortUtils.printArr(arr);
    }

    private static int[] sort(int[] arr) {
//        if (arr == null) {
//            return null;
//        }
//        if (arr.length == 0 || arr.length == 1) {
//            return arr;
//        }
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[j] > arr[j + 1]) {
//                    SortUtils.swap(arr, j, j + 1);
//                }
//            }
//        }
        return arr;
    }


    private static int[] sort1(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    private static int[] sort2(int[] arr){
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        //i标识 0 - i 已有序
        for (int i = 0; i < arr.length - 1; i++){
            // j标识新插入值的下标
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    SortUtils.swap(arr, j, j - 1);
                }
            }
        }

        return arr;
    }
}
