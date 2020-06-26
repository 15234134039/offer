package com.it.t03;

import java.util.Stack;


/**
 * 力扣 30.包含min函数的栈?
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class LeetCode30 {
    Stack<Integer> stack;
    int min;

    public LeetCode30() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min){
            min = stack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
