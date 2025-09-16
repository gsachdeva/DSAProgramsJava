package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 15/09/25
 */
import java.util.PriorityQueue;
import java.util.Collections;

public class MedianFinder {
    // max-heap for lower half
    private PriorityQueue<Integer> lower;
    // min-heap for upper half
    private PriorityQueue<Integer> higher;

    public MedianFinder() {
        lower = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        higher = new PriorityQueue<>(); // min-heap
    }

    // Add number to data structure
    public void addNum(int num) {
        // Step 1: push into appropriate heap
        if (lower.isEmpty() || num <= lower.peek()) {
            lower.add(num);
        } else {
            higher.add(num);
        }

        // Step 2: rebalance so size difference <= 1
        if (lower.size() - higher.size() > 1) {
            higher.add(lower.poll());
        } else if (higher.size() - lower.size() > 1) {
            lower.add(higher.poll());
        }
    }

    // Return median as double (works for both odd and even counts)
    public double findMedian() {
        if (lower.size() == higher.size()) {
            if (lower.isEmpty()) return 0.0; // no elements
            return (lower.peek() + higher.peek()) / 2.0;
        } else if (lower.size() > higher.size()) {
            return lower.peek();
        } else {
            return higher.peek();
        }
    }

    // Example usage
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        int[] stream = {5, 15, 1, 3};
        for (int x : stream) {
            mf.addNum(x);
            System.out.println("Added " + x + ", median = " + mf.findMedian());
        }
    }
}
