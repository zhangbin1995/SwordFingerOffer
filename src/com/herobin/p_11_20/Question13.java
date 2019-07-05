package com.herobin.p_11_20;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

/**
 * 思路1：类似冒泡算法，前偶后奇数就交换。
 * 思路2：再创建一个数组，遍历旧数组，遇见偶数，就保存到新数组，同时从原数组中删除，最后将新数组的数添加到老数组。
 * 因为思路2中的数组长度不好处理，可以考虑定义两个list，一个存放奇数一个存放偶数，最后遍历重新写入数组。
 */
//第一种方式，冒泡排序
//public class Solution {
//    public void reOrderArray(int [] array) {
//        for (int i = 1 ; i < array.length ; i ++){
//            for (int j = 0 ; j < array.length - i ; j ++){
//                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1){
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//    }
//}
//第二种方式
import java.util.ArrayList;

public class Question13 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i : array){
            if (i % 2 == 1){
                arrayList1.add(i);
            }else{
                arrayList2.add(i);
            }
        }
        int len = arrayList1.size();
        for (int i = 0 ;i < arrayList1.size() ; i ++){
            array[i] = arrayList1.get(i);
        }
        for (int i = 0 ;i < arrayList2.size() ; i ++){
            array[len + i] = arrayList2.get(i);
        }
    }
}



