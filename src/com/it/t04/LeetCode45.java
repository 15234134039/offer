package com.it.t04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 45. 把数组排成最小的数
 *
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: "102"
 *
 * 疑惑？比较器原理
 */
public class LeetCode45 {

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String s = minNumber(nums);
        System.out.println(s);
    }

    public static String minNumber(int[] nums) {
        if (nums == null || nums.length == 0){
            return null;
        }

        String[] ss = new String[nums.length];

        for (int i = 0; i < nums.length; i++){
            ss[i] = String.valueOf(nums[i]);
        }

//        Arrays.sort(ss, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s1+s2).compareTo(s2+s1);
//            }
//        });

        Arrays.sort(ss, (s1,s2)->{
            return (s1+s2).compareTo(s2+s1);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : ss){
            sb.append(s);
        }

        return sb.toString();
    }
}
