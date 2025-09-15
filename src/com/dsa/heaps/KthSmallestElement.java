package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
import java.util.*;

public class KthSmallestElement {
    public static int findKthSmallest(int[] nums, int k) {
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }

        return maxHeap.peek(); // root = kth smallest
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest: " + findKthSmallest(arr, k)); // 7
    }
}
