package com.dsa.stacks;

import java.util.Arrays;
import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 26/08/25
 */
public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int n = arr.length;

        int[] result = new int[n];

        // Stack to keep track of elements
        Stack<Integer> stack = new Stack<>();

        for(int i = n- 1; i>=0;i--){

            // Step 1: Pop all elements greater or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // Step 2: If stack empty → no smaller element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));

    }
}