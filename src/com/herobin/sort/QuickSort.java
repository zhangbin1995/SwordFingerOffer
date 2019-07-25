package com.herobin.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author binzhang
 * @date 2019-07-25
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 1, 3, 9, 4, 6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = partition(arr, left, right);
            quickSort(arr, left, mid);
            quickSort(arr, mid + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index =left + 1;
        for (int i = index ; i <= right ; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index++);
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
