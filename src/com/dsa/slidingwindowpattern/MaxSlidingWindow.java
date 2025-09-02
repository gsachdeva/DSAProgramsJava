package com.dsa.slidingwindowpattern;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Author: Gaurav Sachdeva
 * Date: 02/09/25
 */
public class MaxSlidingWindow {

    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k){

        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); // stores *indexes*, not values

        // ---------------------------
        // Step 1: Process first window
        // ---------------------------

        for (int i = 0; i < k; ++i){
            // Remove smaller elements from back
            // Because arr[i] is bigger → older smaller elements can’t be max anymore

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast(); // remove from back
            }
            dq.addLast(i); // add current index at back
        }
        // At this point, dq is decreasing (front = max)

        // ---------------------------
        // Step 2: Process rest of the array
        // ---------------------------
        for (int i = k; i < n; ++i) {
            // Front of deque = max of previous window
            res.add(arr[dq.peekFirst()]);

            // Remove indices which are out of this window
            // (i-k is the left boundary of current window)
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst(); // remove from front
            }

            // Remove all elements smaller than current arr[i]
            // (they are useless because arr[i] dominates them)
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast(); // remove from back
            }

            // Add current index at the back
            dq.addLast(i);
        }
        res.add(arr[dq.peekFirst()]);
        return res;
    }

    public static void main(String[] args) {
            int[] arr = {1, 3, 2, 1, 7, 3};
            int k = 3;
            ArrayList<Integer> res = maxOfSubarrays(arr, k);

            // Print result
            for (int maxVal : res) {
                System.out.print(maxVal + " ");
            }
        }
}