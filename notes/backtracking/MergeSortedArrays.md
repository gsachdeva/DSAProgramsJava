# 🧠 Merge Sort – Approach and Dry Run

---

## ✅ Approach

**Merge Sort** is a divide-and-conquer sorting algorithm with two main phases:

### 1. Divide
- Recursively divide the array into two halves until each subarray has only **one element**.

### 2. Conquer (Merge)
- Merge the sorted subarrays back into a single sorted array.
- During the merge step, use a **two-pointer technique** to compare elements from two sorted subarrays and combine them into a new sorted array.

---

### 🧮 Time & Space Complexity

- **Time Complexity**: O(n log n) – consistent for all cases (best, average, worst).
- **Space Complexity**: O(n) – due to temporary arrays during merge.

---

## 🧪 Dry Run Example

### Input:  
