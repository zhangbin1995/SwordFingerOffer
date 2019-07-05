package com.herobin.p_31_40;

/**
 * 第一个只出现一次的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import java.util.HashMap;
import java.util.Map;

public class Question34 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() <= 1){
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < str.length(); i ++){
            Character c = str.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }
        for (int i = 0 ; i < str.length() ; i ++){
            int num = map.get(str.charAt(i));
            if (num == 1){
                return i;
            }
        }
        return -1;
    }
}
