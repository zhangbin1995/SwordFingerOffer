package com.herobin.p_21_30;

/**
 * 连续子数组的最大和
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=13&tqId=11183&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 第一种方法，直接遍历，将各种求和结果放入list，将list排序后输出最大值。这样时间复杂度为O(n^2)
 */
//public class Question30 {
//    public int FindGreatestSumOfSubArray(int[] array) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0 ; i < array.length ; i ++){
//            int sum = 0;
//            for (int j = i ; j < array.length ; j ++){
//                sum += array[j];
//                list.add(sum);
//            }
//        }
//        Collections.sort(list);
//        return list.get(list.size() - 1);
//    }
//}

/**
 * 动态规划
  */
public class Question30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0]; //记录当前所有子数组的和的最大值
        int tempSum = array[0]; //包含array[i]的连续数组最大值
        for (int i = 1 ; i < array.length ; i++){
            tempSum = Math.max(tempSum + array[i],array[i]);
            sum = Math.max(sum, tempSum);
        }
        return sum;
    }
}

