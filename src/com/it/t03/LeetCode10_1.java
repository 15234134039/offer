package com.it.t03;

/**
 * 力扣 10-1.斐波那契数列
 *
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：1
 */
public class LeetCode10_1 {

    public static void main(String[] args) {

    }

    /**
     * 递归
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return (fib1(n - 1) + fib1(n - 2)) % 1000000007;
    }

    /**
     * 迭代
     * @param n
     * @return
     */
    public int fib2(int n) {
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        int fn1 = 1;
        int fn2 = 0;
        int fn = 0;

        for (int i = 2; i <= n; i++){
            fn = (fn1 +fn2) % 1000000007;
            fn2 = fn1;
            fn1 = fn;
        }

        return fn ;
    }
}
