package com.it.t02;

import com.it.common.ListNode;



/**
 * 力扣 82.删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现的数字。
 *
 * 示例 1:
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 */
public class LeetCode82 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = head;
        ListNode pre = dummy;

        //TODO 有问题
        while (cur != null){
            while (cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }

            cur = cur.next;

            if (pre.next.next == cur){
                pre = pre.next;
            }else {
                pre.next = cur;
            }
        }

        return dummy.next;
    }
}
