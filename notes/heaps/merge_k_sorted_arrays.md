# Merge K Sorted Arrays

## Problem Statement
Given `k` sorted arrays of size `n` each, merge them into a single sorted array.

---

## Example

### Input:
```
k = 3
arrays = [
  [1, 3, 5, 7],
  [2, 4, 6, 8],
  [0, 9, 10, 11]
]
```

### Output:
```
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
```

---

## Approach

We can solve this problem efficiently using a **Min-Heap** (PriorityQueue in Java).

### Steps:
1. Insert the first element of each array into the heap along with its array index and element index.
2. Extract the minimum element from the heap and add it to the result.
3. Insert the next element from the same array into the heap.
4. Repeat until the heap is empty.

---

## Complexity Analysis
- Let total elements = `n * k`  
- Each insertion/deletion in the heap takes `O(log k)`  
- Total complexity = **O(n * k * log k)**


```
