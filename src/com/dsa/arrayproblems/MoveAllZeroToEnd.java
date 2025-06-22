package com.dsa.arrayproblems;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {10, 1, 0, 1, 0, 0, 0, 5};
        int size = arr.length;
        printArrayMoveAllZero(arr, size);
        printArray(arr); // To see output
    }

    public static void printArrayMoveAllZero(int[] arr, int size) {
        int nonZeroIndex = 0;

        // Step 1: Move all non-zero elements to front
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Step 2: Fill remaining positions with 0
        while (nonZeroIndex < size) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
