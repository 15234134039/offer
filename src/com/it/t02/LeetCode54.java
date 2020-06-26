package com.it.t02;

import com.it.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣 54.二叉搜索树的第k大节点
 *
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class LeetCode54 {

    public static void main(String[] args) {

    }

    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = inorder(root, new ArrayList<>());
        return list.get(list.size() - k);
    }

    private List<Integer> inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null){
            return list;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

        return list;
    }
}
