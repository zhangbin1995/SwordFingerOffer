package com.herobin.p_11_20;

import com.herobin.ListNode;

/**
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

public class Question16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode tail = res;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        while (list1 != null){
            tail.next = list1;
            tail = tail.next;
            list1 = list1.next;
        }
        while (list2 != null){
            tail.next = list2;
            tail = tail.next;
            list2 = list2.next;
        }
        res = res.next;
        return res;
    }
}



