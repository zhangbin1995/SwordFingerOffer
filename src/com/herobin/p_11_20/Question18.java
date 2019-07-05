package com.herobin.p_11_20;

/**
 * 二叉树的镜像
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&tqId=11171&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

import com.herobin.TreeNode;

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Question18 {
    public void Mirror(TreeNode root) {
        TreeNode temp;
        if (root != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.left != null){
                Mirror(root.left);
            }
            if (root.right != null){
                Mirror(root.right);
            }
        }
    }
}



