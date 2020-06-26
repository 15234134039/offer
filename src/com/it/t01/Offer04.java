package com.it.t01;

/**
 * 剑指offer 04.二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 */
public class Offer04 {

    public static void main(String[] args) {

    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int i = 0, j = matrix[0].length-1;
        while (i < matrix.length && j > 0 ){
            if (target == matrix[i][j]){
                return true;
            } else if (target > matrix[i][j]){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
