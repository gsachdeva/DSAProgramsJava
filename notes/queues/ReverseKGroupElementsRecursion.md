# Reversing Queue Elements in Groups of K

## Problem Statement
Given a queue of integers and an integer `k`, reverse the queue elements in groups of size `k`. If the number of elements at the end is less than `k`, keep them in the same order.

---

## Approach
1. Use a stack to reverse the first `k` elements.
2. Recur for the remaining elements of the queue.
3. If fewer than `k` elements remain at the end, simply rotate them back into the queue to preserve order.

---

## Example
### Input
Queue = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3

### Process
- Reverse first 3 → [3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
- Reverse next 3 → [3, 2, 1, 6, 5, 4, 7, 8, 9, 10]
- Reverse next 3 → [3, 2, 1, 6, 5, 4, 9, 8, 7, 10]
- Last element (10) is less than k → left as is.

### Output
[3, 2, 1, 6, 5, 4, 9, 8, 7, 10]

---

## Complexity Analysis
- **Time Complexity:** O(n)
  Each element is pushed and popped at most once.
- **Space Complexity:** O(k)
  Stack stores up to `k` elements during reversal.
