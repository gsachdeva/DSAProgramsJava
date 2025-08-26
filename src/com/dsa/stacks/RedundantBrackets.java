package com.dsa.stacks;

import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 24/08/25
 */
public class RedundantBrackets {
    public static boolean hasRedundantBrackets(String expression){
        Stack<Character> stack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(ch == ')'){
                boolean operatorFound = false;
                while(!stack.isEmpty() && stack.peek()!='('){
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        operatorFound = true;
                    }
                }
                if (!stack.isEmpty()) stack.pop();
                if (!operatorFound) return
                        true;

            }else{
                stack.push(ch);
            }
        }
        return false;
    }



    public static void main(String[] args) {
        String expr1 = "((a+b))";
        String expr2 = "(a+(b)/c)";
        String expr3 = "(a+b*(c-d))";

        System.out.println(expr1 + " → " + hasRedundantBrackets(expr1)); // true
        System.out.println(expr2 + " → " + hasRedundantBrackets(expr2)); // true
        System.out.println(expr3 + " → " + hasRedundantBrackets(expr3)); // false
    }
}