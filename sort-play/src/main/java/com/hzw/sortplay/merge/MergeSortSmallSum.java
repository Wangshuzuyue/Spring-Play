package com.hzw.sortplay.merge;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 归并排序 【递归】
 * 【整体分成左右2部分, 分别有序后，再合并】
 */
public class MergeSortSmallSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = sum(arr);
        SortUtils.printArr(arr);
        System.out.println();
        System.out.println(sum);
    }

    private static int sum(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        return process1(arr, 0, arr.length - 1);
    }

    private static int process1(int[] arr, int l, int r){
        if (arr == null || arr.length <= 1){
            return 0;
        }
        if (l >= r){
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        int lSum = process1(arr, l, mid);
        int rSum = process1(arr, mid + 1, r);
        int mSum = merge1(arr, l, mid, r);
        return lSum + rSum + mSum;
    }

    private static int merge1(int[] arr, int l, int mid, int r) {
        int smallSum = 0;
        int[] help = new int[r - l + 1];
        //左数组下标
        int li = l;
        //右数组下标
        int ri = mid + 1;
        //help下标
        int h = 0;
        while (li <= mid && ri <= r){
            if (arr[li] <= arr[ri]){
                help[h++] = arr[li];
                //右组有 r - ri + 1 个比arr[li] 大的数
                smallSum += arr[li] * (r - ri + 1);
                li++;
            }else{
                help[h++] = arr[ri++];
            }
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
        return smallSum;
    }


}
