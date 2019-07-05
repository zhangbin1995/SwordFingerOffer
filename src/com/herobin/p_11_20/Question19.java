package com.herobin.p_11_20;

/**
 * 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import java.util.ArrayList;
public class Question19 {
    ArrayList result = new ArrayList();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        // 左上边界最多到达右下边界 用于判断是否还是剥圈打印
        while (tR <= dR && tC <= dC){
            printMatrix(matrix,tR++,tC++,dR--,dC--);
        }
        return result;
    }

    public void printMatrix(int[][] matrix, int tR, int tC, int dR, int dC) {
        // 如果只是一横行 打印该行的列结束
        if (tR == dR){
            for (int i = tC ; i <= dC ; i ++){
                result.add(matrix[tR][i]);
            }
        }else if (tC == dC){
            // 如果只是一竖行，打印该竖行结束
            for (int i = tR ; i <= dR ; i++){
                result.add(matrix[i][tC]);
            }
        }else{
            // 用2个变量储存 用于判断当前位置
            int curR = tR;
            int curC = tC;
            // 上
            while (curC != dC){
                result.add(matrix[tR][curC]);
                curC ++;
            }
            // 右
            while (curR != dR){
                result.add(matrix[curR][dC]);
                curR ++;
            }
            // 下
            while (curC != tC){
                result.add(matrix[dR][curC]);
                curC --;
            }
            // 左
            while (curR != tR){
                result.add(matrix[curR][tC]);
                curR --;
            }
        }

    }
}



