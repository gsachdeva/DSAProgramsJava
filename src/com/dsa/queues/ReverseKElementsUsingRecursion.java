package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class ReverseKElementsUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);
        reverseFirstK(q, 3);
        System.out.println("After Reversing First 5 Elements: " + q);
    }

    public static void reverseFirstK(Queue<Integer> q, int k){
        if (q == null || k <= 0 || k > q.size()) {
            return;
        }
        moveKToEnd(q,k);
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
    }
    static void moveKToEnd(Queue<Integer> q, int k){
        if(k==0)
            return;
        int element = q.poll();
        moveKToEnd(q,k-1);
        q.add(element);

    }
}