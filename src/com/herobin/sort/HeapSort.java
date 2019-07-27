package com.herobin.sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 1, 3, 9, 4, 6};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        for (int i = arr.length / 2 ; i >= 0 ; i --) {
            downAdjust(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1 ; i > 0 ; i --) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downAdjust(arr, 0, i);
        }
    }

    private static void downAdjust(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex ++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            arr[childIndex] = temp;
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
    }
}
