package com.herobin.p_11_20;

/**
 * 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import com.herobin.ListNode;

import java.util.Stack;
public class Question15 {
    public ListNode ReverseList(ListNode head) {
        Stack stack = new Stack();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode res = new ListNode(0);
        ListNode tail = res;
        int i = 0;
        while (!stack.isEmpty()){
            tail.next = (ListNode) stack.pop();
            tail = tail.next;
            i ++;
        }
        tail.next = null;
        res = res.next;
        return res;
    }
}



