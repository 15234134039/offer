package com.it.t03;

import java.util.*;

/**
 * 力扣 39.数组中出现次数超过一半的数字
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 */
public class LeetCode39 {

    public static void main(String[] args) {

    }

    /**
     * 摩尔投票法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0, value = -1;

        for (int n : nums){
            if (count == 0){
                value = n;
                count = 1;
            }

            if (value == n){
                count++;
            }else {
                count--;
            }
        }

        return value;

    }

    /**
     * HashMap解法
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return 0;
    }

    /**
     * 排序取中值
     * @param nums
     * @return
     */
    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
