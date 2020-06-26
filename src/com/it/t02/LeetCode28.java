package com.it.t02;

import com.it.common.TreeNode;

/**
 * 力扣 28.对称的二叉树
 *
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 示例 1：
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 *
 */
public class LeetCode28 {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }

        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode A, TreeNode B) {
        if (A == B && B == null){
            return true;
        }
        if (A == null || B == null){
            return false;
        }

        return A.val == B.val && helper(A.left, B.right) && helper(A.right, B.left);
    }
}
