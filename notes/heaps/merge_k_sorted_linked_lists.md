# Merge K Sorted Linked Lists

## Problem Statement
You are given `k` sorted linked lists. Merge them into one sorted linked list and return its head.

---

## Example

### Input:
```
lists = [
  1 -> 4 -> 5,
  1 -> 3 -> 4,
  2 -> 6
]
```

### Output:
```
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null
```

---

## Approach (Using Min Heap)
1. Create a **Min-Heap** (PriorityQueue in Java).
2. Push the head node of each list into the heap.
3. Extract the minimum node from the heap and add it to the result list.
4. If the extracted node has a `next`, push it into the heap.
5. Repeat until the heap is empty.

---

## Complexity Analysis
- Let total nodes = `N` (sum of all list lengths).
- Heap operations take `O(log k)`.
- Final complexity → **O(N log k)**.

---

## Dry Run (High-Level)
- Heap initially: `[1(from l1), 1(from l2), 2(from l3)]`
- Extract 1 → result: `1`
- Heap: `[1(l2), 2(l3), 4(l1)]`
- Extract 1 → result: `1 -> 1`
- Heap: `[2(l3), 4(l1), 3(l2)]`
- Extract 2 → result: `1 -> 1 -> 2`
- Continue until all nodes are extracted.

Final merged list:
```
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null
```
