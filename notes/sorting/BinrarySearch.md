# 🔍 Binary Search (Iterative) – Algorithm & Notes

## 📌 Description

Binary Search is an efficient searching algorithm used to find the position of a target value in a **sorted array**. It follows a divide-and-conquer approach.

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) (Iterative version)

---

## 🧠 Algorithm Steps

1. **Initialize two pointers**:
    - `left` to the first index (`0`)
    - `right` to the last index (`n - 1`)

2. **Repeat while `left <= right`:**
    - Calculate the middle index:  
      `mid = left + (right - left) / 2`
    - Compare the middle element `arr[mid]` with the `target`

3. **Three possible cases**:
    - If `arr[mid] == target`:  
      → Target found, return `mid`
    - If `arr[mid] < target`:  
      → Search in the **right half**, update `left = mid + 1`
    - If `arr[mid] > target`:  
      → Search in the **left half**, update `right = mid - 1`

4. If the loop ends without finding the target:  
   → Return `-1` (target not found)

---

## 🧪 Input Example

- Input Array: `[2, 4, 6, 8, 10]`
- Target: `8`
- Output: `3` (index of 8)

---

## 📂 Reference Code File

➡️ See implementation in [`BinarySearch.java`]

---

## 📚 Notes

- The input array **must be sorted** for binary search to work correctly.
- To find **first/last occurrence** of a duplicate element, modify the conditions.
- Use **recursive version** if needed, but iterative is preferred for stability and memory.

---

## 📌 Related Concepts

- Lower Bound & Upper Bound
- Recursive Binary Search
- Binary Search in Rotated Sorted Array
- First/Last Occurrence with Binary Search

---
