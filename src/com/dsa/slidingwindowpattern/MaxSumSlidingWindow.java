package com.dsa.slidingwindowpattern;

import java.util.Arrays;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class MaxSumSlidingWindow {

    public static int maxSumSubarray(int[] arr, int k){
        int n = arr.length;
        int windowSum = 0, maxSum = Integer.MIN_VALUE;

        // Step 1: Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k]; // add new element, remove oldest
            maxSum = Math.max(maxSum, windowSum);

            // Dry Run Printing
            System.out.println("Window [" + (i - k + 1) + "–" + i + "] : "
                    + Arrays.toString(Arrays.copyOfRange(arr, i - k + 1, i + 1))
                    + " -> Window Sum = " + windowSum + ", Max Sum = " + maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " = " + maxSum);
    }
}