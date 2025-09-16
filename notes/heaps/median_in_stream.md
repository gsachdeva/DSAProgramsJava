# Median in a Stream

## Approach

We want to find the median after every insertion into a stream of
numbers.\
To achieve this efficiently, we use two heaps:

-   **MaxHeap (left half)** → stores the smaller half of numbers. Root
    gives the maximum of the left half.
-   **MinHeap (right half)** → stores the larger half of numbers. Root
    gives the minimum of the right half.

### Rules:

1.  Insert the new number into one of the heaps:
    -   If the number is smaller than or equal to MaxHeap root → insert
        into MaxHeap.
    -   Otherwise → insert into MinHeap.
2.  Balance the heaps so that their sizes differ by at most 1.
3.  Median:
    -   If both heaps have equal size → median = average of roots.
    -   If one heap is larger → median = root of that heap.

This ensures **O(log n)** insertion and **O(1)** median retrieval.

------------------------------------------------------------------------

## Dry Run Example 1

### Stream = \[5, 15, 1, 3, 8\]

  ---------------------------------------------------------------------------
  Step   Number Inserted  MaxHeap (left half)  MinHeap (right half)  Median
  ------ ---------------- -------------------- --------------------- --------
  1      5                \[5\]                \[\]                  5

  2      15               \[5\]                \[15\]                10.0

  3      1                \[5, 1\]             \[15\]                5

  4      3                \[3, 1\]             \[5, 15\]             4.0

  5      8                \[3, 1\]             \[5, 15, 8\]          5
  ---------------------------------------------------------------------------

Sorted sequence: \[1, 3, 5, 8, 15\] → median = 5 ✅

------------------------------------------------------------------------

## Dry Run Example 2

### Stream = \[5, 15, 1, 3, 8, 7, 9, 10, 6, 11\]

  ---------------------------------------------------------------------------
  Step   Number Inserted  MaxHeap (left half)  MinHeap (right half)  Median
  ------ ---------------- -------------------- --------------------- --------
  1      5                \[5\]                \[\]                  5

  2      15               \[5\]                \[15\]                10.0

  3      1                \[5, 1\]             \[15\]                5

  4      3                \[3, 1\]             \[5, 15\]             4.0

  5      8                \[3, 1\]             \[5, 15, 8\]          5

  6      7                \[5, 1, 3\]          \[7, 15, 8\]          6.0

  7      9                \[5, 1, 3\]          \[7, 9, 8, 15\]       7

  8      10               \[7, 5, 3, 1\]       \[8, 9, 10, 15\]      7.5

  9      6                \[6, 5, 3, 1\]       \[7, 8, 10, 15, 9\]   6.5

  10     11               \[6, 5, 3, 1\]       \[7, 8, 10, 15, 9,    7
                                               11\]                  
  ---------------------------------------------------------------------------

Sorted sequence after all = \[1, 3, 5, 6, 7, 8, 9, 10, 11, 15\]\
Medians after each step = \[5, 10.0, 5, 4.0, 5, 6.0, 7, 7.5, 6.5, 7\]

------------------------------------------------------------------------

## Key Takeaways

-   Two heaps ensure we can always find the middle efficiently.\
-   Balancing is crucial to keep size difference ≤ 1.\
-   The median is simply the root(s) of the heaps depending on their
    sizes.
