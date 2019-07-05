package com.herobin.p_11_20;

/**
 * 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

import com.herobin.TreeNode;
public class Question17 {
    public static boolean HasSubtree(TreeNode tree1, TreeNode tree2) {
        boolean result = false;
        //当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
        if (tree1 != null && tree2 != null){
            //如果找到了对应Tree2的根节点的点
            if (tree1.val == tree2.val){
                //以这个根节点为为起点判断是否包含Tree2
                result = doesTree1HaveTree2(tree1,tree2);
            }
            //如果找不到，那么就再去root的左儿子当作起点，去判断是否包含Tree2
            if (!result){
                result = doesTree1HaveTree2(tree1.left,tree2);
            }
            //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
            if (!result){
                result = doesTree1HaveTree2(tree1.right,tree2);
            }
        }
        //返回结果
        return result;
    }

    public static boolean doesTree1HaveTree2(TreeNode tree1, TreeNode tree2) {
        //如果Tree2已经遍历完了都能对应的上，返回true
        if (tree2 == null){
            return true;
        }
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (tree1 == null){
            return false;
        }
        //如果其中有一个点没有对应上，返回false
        if (tree1.val != tree2.val){
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return doesTree1HaveTree2(tree1.left,tree2.left) && doesTree1HaveTree2(tree1.right,tree2.right);
    }
}



