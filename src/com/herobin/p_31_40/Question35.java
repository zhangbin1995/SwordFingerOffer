package com.herobin.p_31_40;

/**
 * 数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5?tpId=13&tqId=11188&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question35 {
    // 定义返回总数
    int count;
    public int InversePairs(int [] array) {
        if (array.length <= 0){
            return count;
        }
        divide(array, 0, array.length - 1);
        return count;
    }

    // 分而治之 先分后治
    private void divide(int[] array, int left, int right) {
        if (left >= right){
            return;
        }
        int mid = left + (right - left)/2;
        divide(array, left, mid);
        divide(array, mid + 1, right);
        // 分完之后开始治
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        if (left >= right){
            return;
        }
        int[] tempArr = new int[right - left + 1];
        int i=left,j=mid+1,k=0;
        while (i <= mid && j <=right){
            if (array[i] < array[j]){
                tempArr[k++] = array[i++];
            } else {
                tempArr[k++] = array[j++];
                count = (count + mid - i + 1)%1000000007;
            }
        }
        while (i<=mid){
            tempArr[k++] = array[i++];
        }
        while (j<=right){
            tempArr[k++] = array[j++];
        }
        //覆盖原数组
        for (k = 0 ; k < tempArr.length ; k++){
            array[left + k] = tempArr[k];
        }
    }
}