# 🏔️ Peak Index in a Mountain Array – Binary Search Approach

## 🔍 Problem Statement

Given a **mountain array** (i.e., strictly increasing and then strictly decreasing), your task is to **find the index of the peak element** using **binary search**.

---

## 🧠 Understanding the Mountain Array

A **mountain array** has the following properties:

- Array size is at least 3.
- There exists an index `i` such that:
    - `arr[0] < arr[1] < ... < arr[i]`
    - `arr[i] > arr[i+1] > ... > arr[n-1]`

📌 The **peak** is the element `arr[i]` which is **greater than both neighbors**.

---

## 💡 Binary Search Approach (Without Code)

### ✅ Logic:

1. Initialize two pointers: `start = 0`, `end = arr.length - 1`.
2. While `start < end`:
    - Calculate `mid = (start + end) / 2`.
    - Compare `arr[mid]` and `arr[mid + 1]`.
        - If `arr[mid] < arr[mid + 1]`:
            - You are in the **ascending** part → Move right → `start = mid + 1`.
        - Else:
            - You are in the **descending** part → Move left → `end = mid`.
3. Loop ends when `start == end` → That's the **peak index**.

---

## 🔁 Dry Run

### Example: `arr = [1, 3, 5, 7, 6, 4, 2]`

We want to find the index of the peak element.

| Iteration | Start | End | Mid | arr[mid] | arr[mid + 1] | Comparison          | Move              |
|-----------|-------|-----|-----|----------|--------------|---------------------|-------------------|
| 1         | 0     | 6   | 3   | 7        | 6            | 7 > 6 (descending)  | `end = mid = 3`   |
| 2         | 0     | 3   | 1   | 3        | 5            | 3 < 5 (ascending)   | `start = mid + 1` |
| 3         | 2     | 3   | 2   | 5        | 7            | 5 < 7 (ascending)   | `start = mid + 1` |
|           | 3     | 3   |     |          |              | Loop ends           | Return `start = 3`|

✅ Peak found at **index 3**, which is value `7`.

---

## 📊 Time & Space Complexity

- **Time Complexity**: `O(log n)` – Efficient due to binary search.
- **Space Complexity**: `O(1)` – No additional space required.

---

## ✅ Summary of Movement Rules

| Condition                    | Meaning             | Action             |
|-----------------------------|---------------------|--------------------|
| `arr[mid] < arr[mid + 1]`   | Ascending slope     | `start = mid + 1`  |
| `arr[mid] > arr[mid + 1]`   | Descending slope    | `end = mid`        |

When the loop ends, `start == end` gives the **peak index**.
