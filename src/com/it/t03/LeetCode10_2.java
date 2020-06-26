package com.it.t03;

/**
 * 力扣 10.2青蛙跳台阶问题
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 */
public class LeetCode10_2 {

    public static void main(String[] args) {

    }

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        int fn = 0;
        int fn1 = 2;
        int fn2 = 1;

        for (int i = 3; i <= n; i++){
            fn = (fn1 + fn2) % 1000000007;
            fn2 = fn1;
            fn1 = fn;
        }

        return fn;
    }
}
