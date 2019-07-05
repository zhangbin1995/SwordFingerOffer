package com.herobin.p_21_30;

/**
 * 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tqId=11181&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=2
 */

import java.util.HashMap;

public class Question28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length <= 0){
            return 0;
        }
        if (array.length == 1){
            return array[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int mid = array.length % 2 == 0 ? array.length / 2 + 1 : array.length / 2 + 1;
        for (int i = 0 ; i < array.length ; i ++){
            int key = array[i];
            if (map.containsKey(key)){
                int val = map.get(key);
                map.put(key,val + 1);
                if (val + 1 >= mid){
                    return key;
                }
            } else {
                map.put(key,1);
            }
        }
        return 0;
    }
}
