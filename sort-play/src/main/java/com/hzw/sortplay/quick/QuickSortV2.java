package com.hzw.sortplay.quick;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:29
 * @description: 快速排序【利用荷兰国旗, 能够一次性确定多个重复值的位置】O(n²),
 */
public class QuickSortV2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 15, 2, 30, 3, 1, 8, 7, 19, 4, 4, 30};
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
