package com.it.t02;

import com.it.common.ListNode;

/**
 * 力扣 52.两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class LeetCode52 {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b){
            if (a == null){
                a = headB;
            }else {
                a = a.next;
            }

            if (b == null){
                b = headA;
            }else {
                b = b.next;
            }
        }

        return a;
    }
}
