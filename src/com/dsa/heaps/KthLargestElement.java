package com.dsa.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add all elements into heap
        for (int num : nums) {
            maxHeap.add(num);
        }
        // Remove max k-1 times
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }

        // The root is now the Kth largest
        return maxHeap.peek();

    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 1;
        System.out.println("Kth Largest: " + findKthLargest(arr, k));
    }
}
