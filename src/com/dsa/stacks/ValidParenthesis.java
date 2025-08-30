package com.dsa.stacks;


import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 24/08/25
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();
        for(char ch: input.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) return false;
                int top = stack.pop();
                if(ch == ')' && top != ')'
                || ch == ']' && top != ']'
                || ch == '}' && top != '}'
                ) {
                    return false;
                }
            }
        }
        return false;
    }
}