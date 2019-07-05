package com.herobin.p_11_20;

/**
 * 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：这里要能做到在某个最小元素出栈后，min返回的就是次小的，所以定义一个min值是行不通的。
 * https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
import java.util.Stack;

public class Question20 {

    // 存放数据的栈
    Stack<Integer> stack = new Stack<>();
    // 获取最小值的辅助栈
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (minStack.isEmpty() || minStack.peek() >= node){
            // 栈是后进先出的，这样能保证每次压入的都是栈中的最小值（可重复）
            minStack.push(node);
        }
    }

    public void pop() {
        // 只有当出的值是最小值时，辅助栈才出栈
        if (minStack != null && stack.peek() == minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        // 栈顶的永远是最小值
        return minStack.peek();
    }
}



