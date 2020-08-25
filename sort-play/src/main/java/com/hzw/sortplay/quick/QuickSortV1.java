package com.hzw.sortplay.quick;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 快速排序【每次拿分区的最右一个数为基准值】 O(n²)
 */
public class QuickSortV1 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4};
        sort(arr);
        SortUtils.printArr(arr);
    }

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        process(arr, 0, arr.length - 1);
        return arr;
    }

    private static void process(int[] arr, int l, int r){
        if (l >= r){
            return;
        }
        int less = l - 1;
        int more = r;
        int i = l;
        while (i <= r){
            if (arr[i] <= arr[r]){
                SortUtils.swap(arr, ++less, i);
                i++;
            }else{
                SortUtils.swap(arr, --more, i);
            }
            if (i == more){
                SortUtils.swap(arr, more, r);
                break;
            }
        }
        //每次都会排好一个数的位置，所以那个数就不用动了
        process(arr, l, i - 1);
        process(arr, i + 1, r);
    }

}
