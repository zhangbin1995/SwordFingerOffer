package com.herobin.p_21_30;

/**
 * 字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=2
 */

import java.util.ArrayList;
import java.util.Collections;

public class Question27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str != null && str.length() > 0){
            Permutation(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return res;
    }

    private void Permutation(char[] str, int i, ArrayList<String> list) {
        if (i == str.length - 1){
            String val = String.valueOf(str);
            if (!list.contains(val)){
                list.add(val);
            }
        } else {
            for (int j = i ; j < str.length ; j ++){
                swap(str, i, j);
                Permutation(str, i+1, list);
                swap(str, i, j);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

