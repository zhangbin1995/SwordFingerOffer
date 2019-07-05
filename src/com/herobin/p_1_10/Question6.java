package com.herobin.p_1_10;

/**
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
import java.util.ArrayList;
/**
 * 注意输入的是一个已经旋转过的，若是没有旋转过输出第一个值，因为是非递减（递增）数组，如果旋转过，遍历时很容易找到
 */
public class Question6 {
    public int minNumberInRotateArray(int [] array) {

        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }

        for(int i=0;i<array.length-1;i++){
            // 前面的值大于后面的值，说明找到了反转的地方
            if(array[i]>array[i+1]){
                return array[i+1];
            }else{
                // 比对了倒数第二个值和最后一个值后说明没有反转，输出第一个值
                if(i==array.length-2){
                    return array[0];
                }
            }
        }
        return 0;
    }
}

