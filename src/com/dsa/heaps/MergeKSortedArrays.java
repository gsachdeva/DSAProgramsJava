package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
import java.util.*;

class Element {
    int value;
    int row;   // which array
    int col;   // index inside that array

    Element(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}

public class MergeKSortedArrays {

    public static List<Integer> mergeKArrays(int[][] arrays) {
        List<Integer> result = new ArrayList<>();

        // Min Heap based on value
        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.value));

        // Step 1: Push first element of each array
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                minHeap.add(new Element(arrays[i][0], i, 0));
            }
        }

        // Step 2: Process heap
        while (!minHeap.isEmpty()) {
            Element current = minHeap.poll();
            result.add(current.value);

            // Insert next element from same array
            int nextCol = current.col + 1;
            if (nextCol < arrays[current.row].length) {
                minHeap.add(new Element(arrays[current.row][nextCol], current.row, nextCol));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        List<Integer> merged = mergeKArrays(arrays);
        System.out.println("Merged array: " + merged);
    }
}
