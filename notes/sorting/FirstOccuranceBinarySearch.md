# First Occurrence Binary Search

This document explains how to find the **first occurrence** of a target element in a sorted array using the binary search algorithm.

---

## ✅ Problem

Given a sorted array (which may contain duplicates), find the **first index** at which a target value appears.

---

## 💡 Approach

- Use binary search to efficiently narrow down the search range.
- When the middle element equals the target, **store the index** and **continue searching to the left** (by moving `high = mid - 1`).
- This ensures that the first (leftmost) occurrence is returned.

---

## 🧪 Example

**Input:**
- `nums = [1, 2, 2, 2, 3, 4, 5]`
- `target = 2`

**Output:**
- `1` (First occurrence of `2` is at index 1)