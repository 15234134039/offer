package com.it.t01;

import com.it.common.ListNode;

/**
 * 力扣 203.移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 */
public class LeetCode203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        cur.next = head;

        while (cur != null && cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
