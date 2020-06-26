package com.it.t04;

/**
 * 力扣 21.调整数组顺序使奇数位于偶数前面
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 */
public class LeetCode21 {

    public static void main(String[] args) {

    }

    public int[] exchange(int[] nums) {

        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j+1 <= i; j++) {
                if (nums[j] % 2 == 0 && nums[j+1] % 2 == 1) {
                    swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
