package com.herobin.p_31_40;

/**
 * 整数中1出现的次数（从1到n整数中1出现的次数）
 * 求出1 ~ 13的整数中1出现的次数,并算出100 ~ 1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6?tpId=13&tqId=11184&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question31 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1 ; i <= n ; i ++){
            String str = String.valueOf(i);
            char[] chars = str.toCharArray();
            for (int j = 0 ; j < chars.length ; j ++){
                if (chars[j] == '1'){
                    // 注意是1出现的次数 如11中1出现了两次
                    count ++;
                }
            }
        }
        return count;
    }
}
