package com.herobin.p_1_10;

/**
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question7 {
    public int Fibonacci(int n) {
        int a = 1,b=1,c=0;
        if (n <= 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            for (int i = 3 ; i <= n ; i ++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}


