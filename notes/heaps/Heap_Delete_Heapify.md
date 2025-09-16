# Heap Deletion and Heapify (Concepts)

## 1. Deletion in Max Heap (Remove Root)

-   In a Max Heap, deletion always happens at the root (the maximum
    element).
-   Steps:
    1.  Replace the root with the last element in the heap.
    2.  Reduce the heap size by 1.
    3.  Perform **Heapify down** from the root to restore the heap
        property.

------------------------------------------------------------------------

## 2. Heapify (Down-Heapify)

-   Ensures the heap property is maintained after deletion or
    replacement.
-   Process:
    -   Compare the parent with its children.
    -   Swap the parent with the **largest child** if the parent is
        smaller.
    -   Repeat until the parent is greater than both children or a leaf
        node is reached.

------------------------------------------------------------------------

## 3. Heap Sort Connection

-   Heap sort is built upon the concept of deletion and heapify:
    1.  Build a max heap.
    2.  Swap the root (maximum element) with the last element of the
        heap.
    3.  Reduce heap size and apply heapify on the root.
    4.  Repeat until the heap size becomes 1.

------------------------------------------------------------------------

✅ **Key Takeaway:**\
Deletion in heaps and heapify are the fundamental operations that make
heap sort possible.
