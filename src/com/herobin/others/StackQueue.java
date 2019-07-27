package com.herobin.others;

import java.util.Stack;

/**
 * 用栈实现一个队列
 */
public class StackQueue {
    private Stack<Integer> stackA = new Stack<Integer>();
    private Stack<Integer> stackB = new Stack<Integer>();

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enQueue(1);
        stackQueue.enQueue(2);
        stackQueue.enQueue(3);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
        stackQueue.enQueue(4);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
    }

    private void enQueue(int element) {
        stackA.push(element);
    }

    private Integer deQueue() {
        if (stackB.empty()) {
            if (stackA.empty()) {
                return null;
            }
            transfer();
        }
        return stackB.pop();
    }

    private void transfer() {
        while (!stackA.empty()) {
            stackB.push(stackA.pop());
        }
    }
}
