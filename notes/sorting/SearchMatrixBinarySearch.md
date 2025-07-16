# 🧮 Search in a 2D Matrix using Binary Search

## 🔸 Problem Statement
Given an `m x n` matrix where each row is sorted and the first integer of each row is greater than the last integer of 
the previous row, write an efficient algorithm that searches for a target value using Binary Search.

---

## 🔹 Example
```
Input:  matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

---

## 🔍 Dry Run

**Flattened Matrix View**:
```
[1, 3, 5, 7, 10, 11, 16, 20, 23, 30, 34, 60]
```

- total elements: 12 → left = 0, right = 11

| left | right | mid | value | Comparison       | Action               |
|------|-------|-----|--------|------------------|----------------------|
| 0    | 11    | 5   | 11     | 11 > 3           | right = mid - 1      |
| 0    | 4     | 2   | 5      | 5 > 3            | right = mid - 1      |
| 0    | 1     | 0   | 1      | 1 < 3            | left = mid + 1       |
| 1    | 1     | 1   | 3      | 3 == 3           | Found → return true  |

---

## ⏱ Time Complexity
```
O(log (m * n))
```

---

## 💾 Space Complexity
```
O(1)
```
