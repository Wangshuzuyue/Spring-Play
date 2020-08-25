package com.hzw.sortplay;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 2, 30, 8, 7};
        sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] sort(int [] arr){
        if (arr == null){
            return null;
        }
        if (arr.length == 0 || arr.length == 1){
            return arr;
        }
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
