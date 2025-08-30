package com.dsa.stacks;

import java.util.Stack;

import static com.dsa.stacks.InsertInBottomStack.printStack;

/**
 * Author: Gaurav Sachdeva
 * Date: 21/08/25
 */
public class SortStack {
    public static void sortStack(Stack<Integer> stack,int top,int before){
        if(stack.isEmpty()){
            return;
        }
         top = stack.pop();

         if(top < before){
             int temp = top;
             top = before;
             before = temp;
         }
         sortStack(stack,top,before);

    }

    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();

        // Initial pushes
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(50);

        System.out.print("Before: ");
        printStack(stack); // 20 30 40
        sortStack(stack, stack.getLast(),stack.getLast()-1);
        System.out.print("After: ");
        printStack(stack);
    }
}