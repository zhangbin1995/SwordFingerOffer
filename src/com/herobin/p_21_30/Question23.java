package com.herobin.p_21_30;

/**
 * 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

public class Question23 {

    public static void main(String[] args) {
        // 这里测试123时返回的true是对的，因为2是3的左子树，1是2的左子树的情况
        int[] arr = {1,2,3};
        System.out.println(new Question23().VerifySquenceOfBST(arr));
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length <= 0){
            return false;
        }
        return VerifySquenceOfBST(sequence,0,sequence.length - 1);
    }

    private boolean VerifySquenceOfBST(int[] sequence, int left, int right) {
        if (left >= right){
            return true;
        }
        // 后序遍历最后一个值为根节点
        int root = sequence[right];
        // 定位前序后序分界点（二叉搜索树前序都小于根节点，后序都大于根节点）
        int j = left;
        for (int i = left ; i < right ; i ++){
            if (sequence[i] > root){
                break;
            }
            j ++;
        }
        // 遍历后序中是否有小于前序的，如果有，返回false
        for (int i = j+1 ; i < right ; i ++){
            if (sequence[i] < root){
                return false;
            }
        }
        return VerifySquenceOfBST(sequence, left, j-1) && VerifySquenceOfBST(sequence, j, right-1);
    }
}
