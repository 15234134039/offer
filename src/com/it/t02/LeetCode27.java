package com.it.t02;

import com.it.common.TreeNode;

/**
 * 力扣 27.二叉树的镜像
 *
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * 示例 1：
 *
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 *
 */
public class LeetCode27 {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }

        TreeNode l = mirrorTree(root.left);
        TreeNode r = mirrorTree(root.right);

        root.left = r;
        root.right = l;

        return root;



    }



}
