package com.herobin.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author binzhang
 * @date 2019-07-25
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,1,3,9,4,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0 ; i < arr.length - 1 ; i ++ ) {
            int min = i;
            for (int j = i + 1 ; j < arr.length ; j ++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
