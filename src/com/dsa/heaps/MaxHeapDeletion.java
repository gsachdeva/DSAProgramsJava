package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 13/09/25
 */
class MaxHeapDeletion {
    private int[] heap;
    private int size;
    MaxHeap maxHeap;


    public MaxHeapDeletion(int capacity) {
        heap = new int[capacity];
        size = 0;
        maxHeap = new MaxHeap(6);
    }


    public void insert(int value) {
        if (size == heap.length) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        // Bubble up
        while (current > 0 && heap[current] > heap[maxHeap.parent(current)]) {
            swap(current, maxHeap.parent(current));
            current = maxHeap.parent(current);
        }
    }


    // Delete root (max element)
    public int deleteRoot() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty!");
        }

        int root = heap[0];
        heap[0] = heap[size - 1]; // Move last element to root
        size--;
        heapify(0); // Heapify down from root

        return root;
    }

    // Heapify (restore heap property from index i)
    private void heapify(int i) {

        int largest = i;
        int left = maxHeap.leftChild(i);
        int right = maxHeap.rightChild(i);

        // Find largest among root, left and right
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        // If root is not largest, swap and continue
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeapDeletion maxHeap = new MaxHeapDeletion(10);
        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(10);
        maxHeap.insert(60);

        System.out.print("Heap before deletion: ");
        maxHeap.printHeap();


        System.out.println("Deleted root: " + maxHeap.deleteRoot());

        System.out.print("Heap after deletion: ");
        maxHeap.printHeap();
    }
}
