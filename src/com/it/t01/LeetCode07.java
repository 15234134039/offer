package com.it.t01;

import com.it.common.TreeNode;

import java.util.Arrays;

/**
 * 力扣 07.重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class LeetCode07 {

    public static void main(String[] args) {

    }

    public TreeNode reConstructBinaryTree(int [] preorder, int [] inorder) {
        if (preorder == null || preorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        int index = findIndex(preorder, inorder);

        root.left = reConstructBinaryTree(Arrays.copyOfRange(preorder, 1, index+1),
                Arrays.copyOfRange(inorder,0, index));

        root.right = reConstructBinaryTree(Arrays.copyOfRange(preorder, index+1, preorder.length),
                Arrays.copyOfRange(inorder,index+1, inorder.length));

        return root;
    }

    private int findIndex(int[] preorder, int[] inorder) {
        for (int i = 0; i< preorder.length; i++){
            if(inorder[i] == preorder[0]){
                return i;
            }
        }
        return 0;
    }
}
