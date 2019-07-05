package com.herobin.p_1_10;

import com.herobin.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

public class Question3 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        ArrayList<Integer> array = new Question3().printListFromTailToHead(listNode);
        for (int i = 0; i < array.size(); i++)
            System.out.println(array.get(i));
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        for (int index = arrayList.size() - 1; index >= 0; index--) {
            array.add(arrayList.get(index));
        }
        return array;
    }
}



