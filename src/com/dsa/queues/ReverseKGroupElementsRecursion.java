package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class ReverseKGroupElementsRecursion {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);
        reverseInKGroup(q, 3,q.size());
        System.out.println("After Reversing First 5 Elements: " + q);
    }
    public static void reverseInKGroup(Queue<Integer> q, int k, int unUsedElementCount) {
        if (unUsedElementCount >= k) {
            Stack<Integer> s = new Stack<>();

            // Step 1: take k elements from queue and push to stack
            for (int i = 0; i < k; i++) {
                int element = q.poll();
                s.push(element);
            }

            // Step 2: pop from stack (reversed order) and push back to queue
            for (int i = 0; i < k; i++) {
                int element = s.pop();
                q.add(element);
            }

            // Recurse for remaining elements
            reverseInKGroup(q, k, unUsedElementCount - k);
        } else {
            // Rotate the leftover (less than k) elements to back of queue
            for (int i = 0; i < unUsedElementCount; i++) {
                int element = q.poll();
                q.add(element);
            }
        }
    }
}