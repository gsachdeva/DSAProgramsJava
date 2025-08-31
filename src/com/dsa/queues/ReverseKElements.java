package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class ReverseKElements {
    static void reverseFirstK(Queue<Integer> q, int k)
    {
        if (q.isEmpty() || k > q.size())
            return;

        if (k <= 0)
            return;

        Stack<Integer> s = new Stack<>();

        // Step 1: Push first k elements into stack
        for(int i = 0;i<k;i++){
            s.push(q.poll());
        }

        // Step 2: Enqueue back from stack (reversed order)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move the remaining elements to back to maintain order
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
    }
    static void print(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        reverseFirstK(q, k);
        print(q);
    }
}