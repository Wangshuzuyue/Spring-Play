package com.example.demo;

import java.util.Arrays;

/**
 * @author: huangzuwang
 * @date: 2019-12-28 13:48
 * @description: 查找实例
 */
public class SearchDemo {

    public static void main(String[] args) {
        binarySearch();
    }
    
    /**
     * 查找数组是否包含某个值，使用 Arrays.binarySearch() 方法查询。
     * Arrays.binarySearch() 是利用二分法查询某个值
     * 如果查到包含某值会返回该值的下标，如果没有查到则返回负值。
     *
     * 注意: 使用 Arrays.binarySearch 之前一定要先调用 Arrays.sort() 对数组进行排序，
     * 否则返回的结果有误。
     * @author: huangzuwang
     * @date: 2019-12-28 13:53
     * @param
     * @return
     **/
    public static void binarySearch(){
        int[] arr = {1, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
    }
}
