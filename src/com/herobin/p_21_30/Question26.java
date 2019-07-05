package com.herobin.p_21_30;

import com.herobin.TreeNode;

/**
 * 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5?tpId=13&tqId=11179&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tPage=2
 */

public class Question26 {
    TreeNode node;
    TreeNode realNode;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return realNode;
    }

    private void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return;
        // 遍历左节点
        ConvertSub(pRootOfTree.left);

        // 将节点值插入链表中
        if (realNode == null){
            // 若链表为空，则插入第一个节点，即为最后返回的头结点
            node = pRootOfTree;
            realNode = pRootOfTree;
        }else{
            // 将节点插入链表，即将当前尾节点的right（后置指针）指向当前值，同时将当前值的left（前置指针）指向当前尾节点，尾节点后移
            node.right = pRootOfTree;
            pRootOfTree.left = node;
            node = node.right;
        }

        // 遍历右节点
        ConvertSub(pRootOfTree.right);
    }
}

