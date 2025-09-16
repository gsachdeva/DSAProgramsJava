package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 13/09/25
 */
class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Helper methods
    public int parent(int i) { return (i - 1) / 2; }
    public int leftChild(int i) { return 2 * i + 1; }
    public int rightChild(int i) { return 2 * i + 2; }

    // Insert a new element
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        // Step 1: Insert at the end
        heap[size] = value;
        int current = size;
        size++;

        // Step 2: Heapify up (bubble up)
        while (current > 0 && heap[current] > heap[parent(current)]) {
            // Swap with parent if current > parent
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;

            current = parent(current);
        }
    }

    // Print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(10);
        maxHeap.insert(60);

        maxHeap.printHeap(); // Output should maintain max-heap property
    }
}
