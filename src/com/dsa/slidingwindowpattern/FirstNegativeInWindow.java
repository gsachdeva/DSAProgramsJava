package com.dsa.slidingwindowpattern;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class FirstNegativeInWindow {

    public static List<Integer> firstNegativeInWindow(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();  // stores indexes of negative numbers

        for (int i = 0; i < arr.length; i++) {

            // 1. If current element is negative → add its index to deque
            if (arr[i] < 0) {
                dq.addLast(i);
            }

            // 2. Remove elements that are out of this window (i-k+1 is window start)
            if (!dq.isEmpty() && dq.peekFirst() < (i - k + 1)) {
                dq.removeFirst();
            }

            // 3. Once window size is reached (i >= k-1), record the answer
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    result.add(arr[dq.peekFirst()]); // first negative is at deque.front
                } else {
                    result.add(0); // no negative in this window
                }
            }
        }
        return result;
        }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, -4, -9, 6, 7};
        int k = 3;

        List<Integer> ans = firstNegativeInWindow(arr, k);
        System.out.println("First negatives in each window: " + ans);
    }
}