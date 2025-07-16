# 🔁 Finding the Smallest Pivot Index in a Rotated Sorted Array

### 📌 Problem Statement

Given a rotated sorted array (i.e., sorted array rotated at some pivot), find the **index of the smallest element**, which is the point of rotation.

---

### ✅ Approach: Modified Binary Search

1. **Check if the array is already sorted** (i.e., not rotated):
    - If `arr[0] < arr[n-1]`, return index `0`.

2. **Use Binary Search**:
    - Maintain `left` and `right` pointers.
    - Find the `mid` index.
    - If `arr[mid] > arr[right]`, then the smallest element is in the **right half** → `left = mid + 1`.
    - Else, it is in the **left half** (including mid) → `right = mid`.
    - Continue until `left == right`.

3. **Return `left` (or `right`)** as the pivot index.

---

### 🧠 Dry Run

```java
Input: [4, 5, 6, 7, 0, 1, 2]
Initial: left = 0, right = 6

1st Iteration:
  mid = 3 (arr[3] = 7)
  7 > 2 → left = 4

2nd Iteration:
  mid = 5 (arr[5] = 1)
  1 <= 2 → right = 5

3rd Iteration:
  mid = 4 (arr[4] = 0)
  0 <= 1 → right = 4

Now: left = 4, right = 4 → return 4
