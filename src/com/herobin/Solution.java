package com.herobin;

public class Solution {
    public static void main(String[] args) {
        System.out.println();
    }

    int count = 0;
    public int InversePairs(int [] array) {
        if (array.length > 0){
            divide(array, 0, array.length - 1);
        }
        return count;
    }

    private void divide(int[] array, int left, int right) {
        if (left >= right){
            return;
        }
        int mid = left + (right - left)/2;
        divide(array, left, mid);
        divide(array, mid + 1, right);

        merge(array, left, mid, right);

    }

    private void merge(int[] array, int left, int mid, int right) {
        if (left >= right){
            return;
        }
        int[] temp = new int[right - left + 1];
        int i = left,j = mid + 1,k = 0;
        while (i <= mid && j <= right){
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
                count = (count + mid - i + 1) % 1000000007;
            }
        }
        while (i <= mid){
            temp[k++] = array[i++];
        }
        while (j <= right){
            temp[k++] = array[j++];
        }
        for (int index = 0 ; index < k ; index ++){
            array[left + index] = temp[index];
        }
    }
}