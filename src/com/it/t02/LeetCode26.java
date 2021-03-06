package com.it.t02;

import com.it.common.TreeNode;

/**
 * 力扣 26.树的子结构
 *
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 示例 1：
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 */
public class LeetCode26 {

    public static void main(String[] args) {

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null){
            return false;
        }

        return helper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean helper(TreeNode A, TreeNode B) {
        if (B == null){
            return true;
        }

        if (A == null){
            return false;
        }

        return A.val == B.val && helper(A.left, B.left) && helper(A.right, B.right);
    }
}
