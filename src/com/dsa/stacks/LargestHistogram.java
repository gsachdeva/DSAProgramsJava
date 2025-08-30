package com.dsa.stacks;

/**
 * Author: Gaurav Sachdeva
 * Date: 27/08/25
 */
import java.util.*;

public class LargestHistogram {

    // Function to calculate largest rectangle area
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;

        // Step 1: Find Previous Smaller Element (PSE) for each bar
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Step 2: Find Next Smaller Element (NSE) for each bar
        int[] nse = new int[n];
        stack.clear(); // reuse stack
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Step 3: Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Driver code
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area = " + result);
    }
}
