package com.herobin.others;

/**
 * 判断一个数是否为2的整数次幂
 * 1.遍历该数
 * 2.与运算（1行解决）
 */
public class IsPowerOf2 {
    public static void main(String[] args) {
        // 遍历除2查询 O(logn)
        System.out.println(isPowerOf2(32));
        System.out.println(isPowerOf2(31));
        // 与运算 O(log1)
        System.out.println(isPowerOf2New(32));
        System.out.println(isPowerOf2New(31));
    }

    private static boolean isPowerOf2New(int num) {
        return (num & num - 1) == 0;
    }

    private static boolean isPowerOf2(int num) {
        int temp = 1;
        while (temp <= num) {
            temp = temp << 1;
            if (temp == num) {
                return true;
            }
        }
        return false;
    }


}
