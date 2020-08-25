package com.hzw.sortplay.quick;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 快速排序【利用荷兰国旗】
 */
public class QuickSortV2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 4, 2, 30, 4, 3, 1, 8, 7, 19, 4};
        sort(arr);
        SortUtils.printArr(arr);
    }

    private static int[] sort(int[] arr) {
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

        int[] equalArea = getEqualArea(arr, l, r);


        //每次都会排好一个数的位置，所以那个数就不用动了
        process(arr, l, equalArea[0] - 1);
        process(arr, equalArea[1] + 1, r);
    }

    /**
     * 荷兰国旗
     * @param arr
     * @param l
     * @param r
     * @return 相等区域的左下标和右下标
     */
    private static int[] netherLandsFlag(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        int i = l;
        while (i <= r){
            if (arr[i] <= arr[r]){
                SortUtils.swap(arr, ++less, i);
                i++;
            }
            if (i == more){
                SortUtils.swap(arr, more, r);
                break;
            }
        }
    }

}
