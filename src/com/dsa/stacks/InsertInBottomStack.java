package com.dsa.stacks;
import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/08/25
 */
public class InsertInBottomStack {
    public static void insertAtBottom(Stack<Integer> stack,int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }
        int top = stack.pop();

        insertAtBottom(stack,val);
        stack.push(top);
    }

    // Utility: print stack (from bottom to top)
    public static void printStack(Stack<Integer> stack) {
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Initial pushes
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.print("Before: ");
        printStack(stack); // 20 30 40

        // Insert at bottom
        insertAtBottom(stack, 10);

        System.out.print("After:  ");
        printStack(stack); // 10 20 30 40
    }
}