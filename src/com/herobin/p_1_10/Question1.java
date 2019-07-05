package com.herobin.p_1_10;

/**
 * 二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Question1 {

    public static void main(String[] args) {
        int[][] array = {{1,4,7},{2,5,6},{3,6,9}};
        System.out.println(Find(6,array));
    }
    public static boolean Find(int target, int [][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0;
        int c = col - 1;
        while(r < row && c >= 0){
            if (target == matrix[r][c]){
                return true;
            }else if (target < matrix[r][c]){
                c --;
            }else{
                r ++;
            }
        }
        return false;
    }
}

