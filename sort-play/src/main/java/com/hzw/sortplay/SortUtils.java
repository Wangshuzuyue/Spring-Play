package com.hzw.sortplay;

/**
 * @author: huangzuwang
 * @date: 2020-06-23 19:56
 * @description:
 */
public class SortUtils {

    public static void swap(int[] arr, int x, int y) {
        if (x == y) {
            return;
        }
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {

        int size = (int) (Math.random() * (maxSize + 1));
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (maxValue + 1));
        }
        return arr;
    }


    public static int[] generateSortedArrayDesc(int maxSize, int maxValue) {
        int size = (int) (Math.random() * (maxSize + 1));
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = maxValue--;
        }
        return arr;
    }


    public static int[] generateSortedArrayEsc(int maxSize, int minValue) {
        int size = (int) (Math.random() * (maxSize + 1));
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = minValue++;
        }
        return arr;
    }


    public static int[] copyArray(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static boolean isEqual(int[] ... arrs){
        int[] arr = arrs[0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arrs.length; j++){
                if (arrs[j][i] != arr[i]){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int l = 1;
        int r = 5;
        for (int i = 0; i < 10_0000; i++){
            int offset = (int)(Math.random() * (r - l + 1));
            System.out.println(offset);
        }
    }
}
