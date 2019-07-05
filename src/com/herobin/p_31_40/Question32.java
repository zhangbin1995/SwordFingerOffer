package com.herobin.p_31_40;

/**
 * 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993?tpId=13&tqId=11185&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import java.util.Arrays;
import java.util.Comparator;

public class Question32 {
    public String PrintMinNumber(int [] numbers) {
        String[] strArr = new String[numbers.length];
        for (int i = 0 ; i < numbers.length ; i ++){
            strArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str1.compareTo(str2);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (String string : strArr){
            sb.append(string);
        }
        return sb.toString();
    }
}
