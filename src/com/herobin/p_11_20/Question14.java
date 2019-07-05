package com.herobin.p_11_20;

/**
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 * https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import com.herobin.ListNode;

import java.util.ArrayList;
public class Question14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null){
            return null;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);
        while(head.next != null){
            head = head.next;
            list.add(head);
        }
        if (k > list.size() || k <= 0)
            return null;
        return list.get(list.size() - k);
    }
}




