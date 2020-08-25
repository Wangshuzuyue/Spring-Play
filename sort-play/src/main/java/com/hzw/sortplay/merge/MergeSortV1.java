package com.hzw.sortplay;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 归并排序【整体分成左右2部分, 分别有序后，再合并】
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4};
        sort(arr);
        SortUtils.printArr(arr);
    }

    private static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        process1(arr, 0, arr.length - 1);
        return arr;
    }

    private static void process(int[] arr, int l, int r){
        if (l >= r){
            //无法再细分
            return;
        }
        int mid = l + ((r - l) >> 1);
        process(arr, l, mid);
        process(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    // 合并已有序的子数组
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        //help指针
        int h = 0;
        int li = l;
        int ri = mid + 1;
        while (li <= mid && ri <= r){
            help[h++] = arr[li] <= arr[ri] ? arr[li++] : arr[ri++];
        }
        while (li <= mid){
            help[h++] = arr[li++];
        }
        while (ri <= r){
            help[h++] = arr[ri++];
        }
        //写回arr
        int i = 0;
        for (int ai = l; ai <= r; ai++){
            arr[ai] = help[i++];
        }
    }

    private static void process1(int[] arr, int l, int r){
        if (arr == null || arr.length <= 1){
            return;
        }
        if (l >= r){
            return;
        }
        int mid = l + ((r - l) >> 1);
        process1(arr, l, mid);
        process1(arr, mid + 1, r);
        merge1(arr, l, mid, r);
    }

    private static void merge1(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        //左数组下标
        int li = l;
        //右数组下标
        int ri = mid + 1;
        //help下标
        int h = 0;
        while (li <= mid && ri <= r){
            help[h++] = arr[li] <= arr[ri] ? arr[li++] : arr[ri++];
        }
        while (li <= mid){
            help[h++] = arr[li++];
        }
        while (ri <= r){
            help[h++] = arr[ri++];
        }
        //回写help[] 到arr[]
        h = 0;
        for (int i = l; i <= r; i++){
            arr[i] = help[h++];
        }
    }


}
