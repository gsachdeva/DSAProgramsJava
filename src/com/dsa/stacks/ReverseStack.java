package com.dsa.stacks;

import java.util.Stack;

import static com.dsa.stacks.InsertInBottomStack.insertAtBottom;
import static com.dsa.stacks.InsertInBottomStack.printStack;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/08/25
 */
public class ReverseStack {

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
         int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack,top);
    }
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();

        // Initial pushes
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.print("Before: ");
        printStack(stack); // 20 30 40
        reverse(stack);
        System.out.print("After: ");
        printStack(stack);
    }
}