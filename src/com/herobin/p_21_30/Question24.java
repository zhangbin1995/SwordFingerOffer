package com.herobin.p_21_30;

/**
 * 二叉树中和为某一值的路径
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

import com.herobin.TreeNode;

import java.util.ArrayList;

public class Question24 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null){
            return res;
        }
        findPath(root, target);
        return res;
    }

    private void findPath(TreeNode root, int target) {
        // 因为在FindPath中做了非空判断，且下面的递归前也都做了非空判断，root一定不为空
        path.add(root.val);
        // 已经到达叶子节点，并且正好加出了target
        if (root.val == target && root.left == null && root.right == null){
            // 要将引用封装为对象，不然后面引用的值会变，这里加入的也变了，即每次加入的都为同一个值
            res.add(new ArrayList<>(path));
        }
        // 如果左子树为空，遍历左子树
        if (root.left != null){
            findPath(root.left, target - root.val);
        }
        // 如果右子树非空，递归右子树
        if (root.right != null){
            findPath(root.right, target - root.val);
        }
        //无论当前路径是否加出了target，必须去掉最后一个，然后返回父节点，去查找另一条路径，最终的path肯定为null
        // 回溯遍历，走完左子树要走右子树，不停回溯
        path.remove(path.size() - 1);
        return;
    }
}
