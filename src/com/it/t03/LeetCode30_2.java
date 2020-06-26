package com.it.t03;

import java.util.Stack;

public class LeetCode30_2 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public LeetCode30_2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || x <= s2.peek()){
            s2.push(x);
        }
    }

    public void pop() {
        if (s1.pop().equals(s2.peek())){
            s2.pop();
        }

    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
