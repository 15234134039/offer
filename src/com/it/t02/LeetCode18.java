package com.it.t02;

import com.it.common.ListNode;

/**
 * 力扣 18.删除链表的节点
 *
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 */
public class LeetCode18 {

    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;

        while (cur.next != null){
            if (cur.next.val == val){
//                if (cur.next.next == null){
//                    cur.next = null;
//                }
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    public ListNode deleteNode2(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = head;
        ListNode pre = dummy;

        while (cur != null){
            if (cur.val == val){
                cur = cur.next;
                pre.next = cur;
            }else {
                cur = cur.next;
                pre = pre.next;
            }
        }

        return dummy.next;
    }

}
