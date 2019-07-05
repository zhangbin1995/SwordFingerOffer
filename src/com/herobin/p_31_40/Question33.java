package com.herobin.p_31_40;

/**
 * 丑数
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b?tpId=13&tqId=11186&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import java.util.ArrayList;
import java.util.List;

/**
 * 思路： 我们只用比较3个数：用于乘2的最小的数、用于乘3的最小的数，用于乘5的最小的
 */
public class Question33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (list.size() < index) {
            int mul2 = list.get(i2) * 2;
            int mul3 = list.get(i3) * 3;
            int mul5 = list.get(i5) * 5;
            int tar = Math.min(mul2, Math.min(mul3, mul5));
            if (tar == mul2) i2++;
            if (tar == mul3) i3++;
            if (tar == mul5) i5++;
            list.add(tar);
        }
        return list.get(list.size() - 1);
    }
}
