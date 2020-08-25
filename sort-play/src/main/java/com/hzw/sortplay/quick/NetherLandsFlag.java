package com.hzw.sortplay.quick;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-26 15:50
 * @description: 荷兰国旗【给定一个数组arr, 和一个数a, 大于a的放左边，等于在中间, 小于a的放右边】
 */
public class NetherLandsFlag {


        public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4};
        sort(arr, 8);
        SortUtils.printArr(arr);
    }

        private static int[] sort(int[] arr, int flag) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        process(arr, flag);
        return arr;
    }

    private static void process(int[] arr, int flag) {
            int li = -1;
            int ri = arr.length;
            int i = 0;
            while (i < arr.length){
                if (arr[i] == flag){
                    i++;
                    //不要加continue
                }else if (arr[i] < flag){
                    SortUtils.swap(arr, i, ++li);
                    i++;
                    //不要加continue
                }
                else {
                    SortUtils.swap(arr, i, --ri);
                }
                if (i >= ri){
                    break;
                }
            }
    }

}
