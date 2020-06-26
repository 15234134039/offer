package com.it.t01;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指offer 03.数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Offer03 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 0, 4, 5, 3};
//        System.out.println(findRepeatNumber1(numbers));
        System.out.println(findRepeatNumber2(numbers));

    }

    public static int findRepeatNumber1(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : numbers){
            if(!set.add(num)){
                res = num;
                break;
            }
        }
        return res;
    }

    public static int findRepeatNumber2(int[] numbers) {

        for(int num : numbers){
            if(num < 0 || num >= numbers.length){
                return -1;
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if(i != numbers[i] && numbers[numbers[i]] != numbers[i]){
                swap(numbers, i, numbers[i]);
            }
            if(i != numbers[i] && numbers[numbers[i]] == numbers[i]){
                return numbers[i];
            }
        }

        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
