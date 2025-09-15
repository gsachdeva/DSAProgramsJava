package com.dsa.heaps;

import java.util.PriorityQueue;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
public class MinCostRopes {
     public static int minCost(int[] ropes) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            // Step 1: Add all ropes to min-heap
            for (int rope : ropes) {
                minHeap.add(rope);
            }

            int totalCost = 0;

            // Step 2: Keep combining ropes
            while (minHeap.size() > 1) {
                int first = minHeap.poll();  // smallest
                int second = minHeap.poll(); // second smallest

                int cost = first + second;
                totalCost += cost;

                // Push the combined rope back
                minHeap.add(cost);
            }

            return totalCost;
        }

        public static void main(String[] args) {
            int[] ropes = {4, 3, 2, 6};
            System.out.println("Minimum cost to connect ropes: " + minCost(ropes));
        }
    }
