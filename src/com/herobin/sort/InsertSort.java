package com.herobin.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author binzhang
 * @date 2019-07-25
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 1, 3, 9, 4, 6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 1 ; i < arr.length ; i ++) {
            //int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = temp;
                 j--;
            }
        }
    }
}