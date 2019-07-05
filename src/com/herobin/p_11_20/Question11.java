package com.herobin.p_11_20;

/**
 * 二进制中 1 的个数
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question11 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}



