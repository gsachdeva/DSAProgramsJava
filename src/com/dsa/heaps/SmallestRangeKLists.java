package com.dsa.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: Gaurav Sachdeva
 * Date: 15/09/25
 */
public class SmallestRangeKLists {

    static class Node {
        int value;
        int listIndex;  // which list
        int elementIndex; // position in that list

        Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static int[] smallestRange(List<List<Integer>> nums){
            // Min Heap to always get the smallest element among current picks
            PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);

            int max = Integer.MIN_VALUE; // Track the maximum element among current picks

            // Step 1: Insert the first element from each list into the heap
            for (int i = 0; i < nums.size(); i++) {
                int val = nums.get(i).get(0);
                minHeap.add(new Node(val, i, 0));
                max = Math.max(max, val); // update max
            }

            int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;

            // Step 2: Process the heap
            while (true) {
                Node curr = minHeap.poll(); // get the smallest element
                int min = curr.value;

                // Update range if this is smaller
                if (max - min < rangeEnd - rangeStart) {
                    rangeStart = min;
                    rangeEnd = max;
                }

                // Move to next element in the same list
                if (curr.elementIndex + 1 < nums.get(curr.listIndex).size()) {
                    int nextVal = nums.get(curr.listIndex).get(curr.elementIndex + 1);
                    minHeap.add(new Node(nextVal, curr.listIndex, curr.elementIndex + 1));
                    max = Math.max(max, nextVal); // update max if needed
                } else {
                    // One list exhausted, break loop
                    break;
                }
            }

            return new int[]{rangeStart, rangeEnd};
        }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        int[] result = smallestRange(nums);
        System.out.println("Smallest Range: [" + result[0] + ", " + result[1] + "]");
    }
}