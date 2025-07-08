# Last Occurrence Binary Search

This document explains how to find the **last occurrence** of a target element in a sorted array using the binary search algorithm.

---

## ✅ Problem

Given a sorted array (which may contain duplicates), find the **last index** at which a target value appears.

---

## 💡 Approach

- Use binary search to reduce the search space.
- When the middle element equals the target:
    - Store the index as a potential result.
    - **Continue searching to the right** (by moving `low = mid + 1`) to find the last occurrence.
- Return the final stored index.

---

## 🧪 Example

**Input:**
- `nums = [1, 2, 2, 2, 3, 4, 5]`
- `target = 2`

**Output:**
- `3` (Last occurrence of `2` is at index 3)