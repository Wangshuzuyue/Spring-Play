package com.hzw.sortplay;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 2, 30, 1, 8, 7, 19};
        sort(arr);
        SortUtils.printArr(arr);
    }

    private static int[] sort(int [] arr){
        if (arr == null){
            return null;
        }
        if (arr.length == 0 || arr.length == 1){
            return arr;
        }
        for (int i = arr.length; i >= 0; i--){
            for (int j = 0; j < i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    SortUtils.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}
