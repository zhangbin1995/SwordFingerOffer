package com.herobin.p_1_10;

/**
 * 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("we are superman");
        System.out.println(new Question2().replaceSpace(sb));
    }

    public String replaceSpace(StringBuffer str) {
        int oldCount = str.length() - 1;
        for (int i = 0 ; i <= oldCount ; i ++){
            if (str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int newCount = str.length() - 1;
        while (oldCount >= 0 && newCount >= oldCount){
            if (str.charAt(oldCount) == ' '){
                str.setCharAt(newCount--,'0');
                str.setCharAt(newCount--,'2');
                str.setCharAt(newCount--,'%');
            }else{
                str.setCharAt(newCount--, str.charAt(oldCount));
            }
            oldCount --;
        }
        return str.toString();
    }
}


