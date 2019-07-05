package com.herobin.p_21_30;

/**
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

import com.herobin.TreeNode;

import java.util.ArrayList;

public class Question22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null){
            return list;
        }
        queue.add(root);
        while(queue.size() != 0){
            TreeNode temp = queue.remove(0);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
