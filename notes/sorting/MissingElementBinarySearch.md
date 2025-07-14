# 🧩 Missing Element in Sorted Array using Binary Search

## 🔸 Problem Statement
Given a sorted array of size `n` containing unique elements ranging from `1` to `n+1`, with one element missing, 
find the missing number using Binary Search.

---

## 🔹 Example
```
Input:  arr = [1, 2, 3, 5, 6]
Output: 4
```

---

## 🔍 Dry Run

**Input Array**: `[1, 2, 3, 5, 6]`

| left | right | mid | arr[mid] | Expected | Action            |
|------|-------|-----|----------|----------|-------------------|
| 0    | 4     | 2   | 3        | 3        | mid+1 matches → left = mid + 1 |
| 3    | 4     | 3   | 5        | 4        | arr[mid] > mid+1 → right = mid - 1 |
|      |       |     |          |          | Exit: missing = left + 1 = 4 |

---

## ⏱ Time Complexity
```
O(log n)
```

---

## 💾 Space Complexity
```
O(1)
```
