# 🔁 Finding the Highest Pivot Index in a Rotated Sorted Array

### 📌 Problem Statement

Given a rotated sorted array (e.g., `[4, 5, 6, 7, 0, 1, 2]`), find the **index of the largest element** — i.e., the pivot where the rotation occurred.

---

### ✅ Approach: Modified Binary Search

1. **Base Case**:
    - If the array is not rotated (`arr[0] < arr[n-1]`), the largest element is at the last index: return `n-1`.

2. **Binary Search Loop**:
    - Compute `mid = (left + right)/2`.
    - If `arr[mid] > arr[mid + 1]`, then `mid` is the pivot (largest element).
    - If `arr[mid] > arr[right]`, then pivot is in the **right half** → `left = mid + 1`.
    - Else, pivot is in the **left half** → `right = mid`.

3. **Return `mid` where condition matches**, else return `-1`.

---

### 🧠 Dry Run

```java
Input: [4, 5, 6, 7, 0, 1, 2]
Initial: left = 0, right = 6

1st Iteration:
  mid = 3 (arr[3] = 7)
  arr[3] > arr[4] → 7 > 0 ⇒ return 3

Output: 3 (pivot index), arr[3] = 7
