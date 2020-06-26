package com.it.t01;

import com.it.common.ListNode;

import java.util.Stack;

/**
 * 剑指offer 06.从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class Offer06 {

    public static void main(String[] args) {

    }

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int n = stack.size();
        int[] res = new int[n];

        for (int i = 0; i < n; i++){
            res[i] = stack.pop().val;
        }
        return res;
    }

    public static int[] reversePrint2(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        temp = head;
        int[] res = new int[size];
        for (int i = size-1; i >= 0; i--){
            res[i] = temp.val;
            temp = temp.next;
        }
        return res;
    }
}
