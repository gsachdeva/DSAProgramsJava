package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
public class HeapSort {

    // Heapify a subtree rooted at index i
    public void heapify(int[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Build max heap
    public void buildHeap(int[] arr, int n) {
        // Last non-leaf node is at n/2 - 1
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Main heap sort function
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build max heap
        buildHeap(arr, n);

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (max) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // Utility to print array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {50, 30, 40, 10, 60};

        HeapSort hs = new HeapSort();

        System.out.println("Original array:");
        hs.printArray(arr);

        hs.heapSort(arr);

        System.out.println("Sorted array:");
        hs.printArray(arr);
    }
}
