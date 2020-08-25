package com.hzw.sortplay.bucket;

import com.hzw.sortplay.SortUtils;

/**
 * @description: 桶排序【基数排序】
 * @author: huangzuwang
 * @date: 2020-06-26 21:39
 **/
public class BucketSort1 {

    public static void main(String[] args) {
//        int[] arr = {7, 8, 15, 2};
        int[] arr = SortUtils.generateRandomArray(50, 100);
        sort(arr);
        SortUtils.printArr(arr);
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length <= 1){
            return;
        }
        //获取最高位
        int maxDigit = getMaxDigit(arr);
        radixSort(arr, maxDigit);
    }



    private static void radixSort(int[] arr, int digit) {
        //10进制
        final int radix = 10;
        int[] help = new int[arr.length];
        for (int d = 1; d <= digit; d++){
            int[] countHelp = new int[radix];
            for (int i = 0; i < arr.length; i++){
                //组织成 arr里该位等于下标的有几个
                countHelp[getDigit(arr[i], d)] += 1;
            }

            //组织成 arr里该位小于等于下标的有几个
            for (int i = 1; i < radix; i++){
                countHelp[i] += countHelp[i - 1];
            }

            for (int i = arr.length - 1; i >= 0; i--){
                //从后往前遍历
                int dig = getDigit(arr[i], d);
                help[countHelp[dig] - 1] = arr[i];
                //计数 - 1
                countHelp[dig] -= 1;
            }

            //将help[] 倒到 arr[]
            for (int i = 0; i < arr.length; i++){
                arr[i] = help[i];
            }
        }
    }

    /**
     * 获取数字从个位开始的第digit位
     *
     * value 除以 10的 digit - 1 次幂
     * 再余上 10;
     * @param value
     * @param digit
     * @return
     */
    public static int getDigit(int value, int digit) {
        return ((value / ((int) Math.pow(10, digit - 1))) % 10);
    }

    /**
     * 获取数组中数值的最高位
     * @param arr
     * @return
     */
    private static int getMaxDigit(int[] arr){
        int max = -1;
        for (int value : arr){
            if (value > max){
                max = value;
            }
        }
        int d = 1;
        while ((max = max / 10) != 0){
            d++;
        }
        return d;
    }

}
