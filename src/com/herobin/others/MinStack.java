package com.herobin.others;

import java.util.Stack;

/**
 * 最小栈的实现
 * 实现一个栈，该栈带有出栈（pop）、入栈（push）、取最小元素（getMin）3个方法。要保证这3个方法的时间复杂度都是O(1)
 */
public class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) throws Exception {
        MinStack stack = new MinStack();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        stack.push(5);
        // 此时最小值应该是3
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        // 此时最小值应该是4
        System.out.println(stack.getMin());
    }

    private int getMin() throws Exception {
        if (mainStack.empty()) {
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }

    private int pop() {
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return mainStack.pop();
    }

    private void push(int element) {
        mainStack.push(element);
        if (minStack.empty() || element <= minStack.peek()) {
            minStack.push(element);
        }
    }
}
