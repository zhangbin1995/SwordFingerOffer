package com.herobin.others;

/**
 * 求出最大公约数
 * 1.暴力枚举法
 * 2.辗转相除法（欧几里得算法）：两个正整数a和b（a>b），它们的最大公约数等于a除以b的余数c和b之间的最大公约数
 * 3.更相减损术：两个正整数a和b（a>b），它们的最大公约数等于a-b的差值c和较小数b的最大公约数
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // 暴力枚举法
        System.out.println(getGreatestCommonDivisor(100,58));
        // 辗转相除法（欧几里得算法）
        System.out.println(getGreatestCommonDivisor1(100,80));
        // 更相减损术
        System.out.println(getGreatestCommonDivisor2(27,14));
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2 ; i > 1 ; i --) {
            if (small % i == 0 && big % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private static int getGreatestCommonDivisor1(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        return getGreatestCommonDivisor1(big%small, small);
    }

    private static int getGreatestCommonDivisor2(int a, int b) {
        if (a == b) {
            return a;
        }
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        return getGreatestCommonDivisor2(big - small, small);
    }
}
