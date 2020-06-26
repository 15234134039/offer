package com.it.t03;

import com.it.common.TreeNode;

/**
 * 力扣 55-2 平衡二叉树
 *
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 返回 true
 */
public class LeetCode55_2 {

    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        // |l - r| <= 1
        return l - r >= -1 && l - r <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        if (l > r){
            return l + 1;
        }else {
            return r + 1;
        }

    }
}
