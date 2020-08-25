package com.hzw.sortplay.quick;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 快速排序【利用荷兰国旗】O(nlogn)
 * 与V2最本质区别，每次划分前，随机取分区内的某个数与最后的基准数做交换
 * 概率累加，期望的结果：O(nlogn)
 */
public class QuickSortV3 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {3,4,-1,1};
        sort(arr);
        SortUtils.printArr(arr);
        int testTime = 500;
        int maxSize = 10000;
        int maxValue= 1000;
        boolean successed = true;
        long time1 = 0l;
        long time2 = 0l;
        long time3 = 0l;
        for (int i = 0; i < testTime; i++){
            int[] arr1 = {3,4,-1,1};
//            int[] arr1 = SortUtils.generateRandomArray(maxSize, maxValue);
            //v1 和 v2的最坏情况
//            int[] arr1 = SortUtils.generateSortedArrayEsc(maxSize, maxValue);
//            int[] arr1 = SortUtils.generateSortedArrayDesc(maxSize, maxValue);
            int[] arr2 = SortUtils.copyArray(arr1);
            int[] arr3 = SortUtils.copyArray(arr1);
            long startTime = System.currentTimeMillis();
            QuickSortV1.sort(arr1);
            long endTime1 = System.currentTimeMillis();
            QuickSortV2.sort(arr2);
            long endTime2 = System.currentTimeMillis();
            QuickSortV3.sort(arr3);
            long endTime3 = System.currentTimeMillis();
            time1 += endTime1 - startTime;
            time2 += endTime2 - endTime1;
            time3 += endTime3 - endTime2;
            if (!SortUtils.isEqual(arr1, arr2, arr3)){
                successed = false;
                break;
            }
        }
        System.out.println();
        System.out.println(successed ? "Nice!" : "Oops!");
        System.out.println("V1耗时:" + time1);
        System.out.println("V2耗时:" + time2);
        System.out.println("V3耗时:" + time3);
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
        int offset = (int) (Math.random() * (r - l + 1));
        SortUtils.swap(arr, l + offset, r);
        int[] equalArea = netherLandsFlag(arr, l, r);
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
        while (i <= r) {
            if (arr[i] < arr[r]) {
                SortUtils.swap(arr, ++less, i);
                i++;
            } else if (arr[i] == arr[r]) {
                i++;
            } else {
                SortUtils.swap(arr, --more, i);
            }
            if (i == more) {
                SortUtils.swap(arr, more, r);
                break;
            }
        }
        return new int[]{less + 1, i};
    }




}
