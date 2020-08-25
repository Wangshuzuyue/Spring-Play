package com.hzw.sortplay.merge;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 归并排序 非递归
 * 【两两有序, 四四有序, 八八有序.......】
 */
public class MergeSortV2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 6, 3, 1, 8, 7, 19};
        sort(arr);
        SortUtils.printArr(arr);
    }

    private static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        process(arr);
        return arr;
    }

    private static void process(int[] arr){
        int mergeSize = 1;
        int n = arr.length;
        while (mergeSize < n){
            int l = 0;
            int r;
            int mid;
            while (l < n){
                mid = l + mergeSize - 1;
                if (mid > n - 1){
                    break;
                }
                r = Math.min(mid + mergeSize, n - 1);
                merge(arr, l, mid, r);
                l = r + 1;
            }
            if (mergeSize > n >> 1){
                break;
            }
            if ((mergeSize = mergeSize << 1) > n){
                break;
            }
        }
    }


    // 合并已有序的子数组
    private static void merge(int[] arr, int l, int mid, int r) {
        if (l >= r){
            return;
        }
        int[] help = new int[r - l + 1];
        //help指针
        int h = 0;
        int li = l;
        int ri = mid + 1;
        while (li <= mid && ri <= r) {
            help[h++] = arr[li] <= arr[ri] ? arr[li++] : arr[ri++];
        }
        while (li <= mid) {
            help[h++] = arr[li++];
        }
        while (ri <= r) {
            help[h++] = arr[ri++];
        }
        //写回arr
        int i = 0;
        for (int ai = l; ai <= r; ai++) {
            arr[ai] = help[i++];
        }
    }
}
