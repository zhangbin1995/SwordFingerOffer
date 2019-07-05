package com.herobin.p_21_30;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tqId=11182&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

import java.util.ArrayList;

public class Question29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length <= 0 || input.length < k){
            return list;
        }
        QuickSort(input, 0, input.length - 1);

        for (int i = 0 ; i < k ; i ++){
            list.add(input[i]);
        }
        return list;
    }

    private void QuickSort(int[] input, int left, int right) {
        if (left < right){
            int pivot = partion(input, left, right);
            QuickSort(input, left, pivot - 1);
            QuickSort(input, pivot + 1, right);

        }
    }

    private int partion(int[] input, int left, int right) {
        int pivot = left;
        int index = left + 1;
        for (int i = index ; i <= right ; i ++){
            if (input[i] < input[pivot]){
                swap(input, i, index);
                index ++;
            }
        }
        swap(input, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}


