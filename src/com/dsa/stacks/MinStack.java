package com.dsa.stacks;

import java.util.Stack;

import static java.lang.Math.min;

/**
 * Author: Gaurav Sachdeva
 * Date: 29/08/25
 */
public class MinStack {

    Stack<Integer> mainStack= new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public void pop(){
        if (mainStack.isEmpty()) return;
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(5);
        st.push(2);
        st.push(10);
        st.push(1);
        st.push(3);

        System.out.println("Current Min: " + st.getMin()); // 1
        st.pop();  // removes 3
        st.pop();  // removes 1
        System.out.println("Current Min: " + st.getMin()); // 2
    }
}