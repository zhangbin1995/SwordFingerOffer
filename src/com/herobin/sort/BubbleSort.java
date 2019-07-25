package com.herobin.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author binzhang
 * @date 2019-07-25
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,1,3,9,4,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0 ; i < arr.length ; i ++) {
            boolean flag = true;
            for (int j = 0 ; j < arr.length - 1 - i ; j ++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
