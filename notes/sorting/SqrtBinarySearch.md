# 🧮 Square Root using Binary Search

## 🔸 Problem Statement
Given a non-negative integer `x`, compute and return the square root of `x`. If the square root is not a perfect integer, 
return the floor of the square root using Binary Search.

---

## 🔹 Example
```
Input:  x = 10
Output: 3
Explanation: 3^2 = 9 < 10 and 4^2 = 16 > 10 → floor = 3
```

---

## 🔍 Dry Run

**x = 10**

| left | right | mid | mid² | Comparison         | Action               |
|------|-------|-----|------|--------------------|----------------------|
| 0    | 10    | 5   | 25   | 25 > 10            | right = mid - 1      |
| 0    | 4     | 2   | 4    | 4 < 10             | result = 2, left = mid + 1 |
| 3    | 4     | 3   | 9    | 9 < 10             | result = 3, left = mid + 1 |
| 4    | 4     | 4   | 16   | 16 > 10            | right = mid - 1      |

Loop ends → final answer = 3

---

## ⏱ Time Complexity
```
O(log x)
```

---

## 💾 Space Complexity
```
O(1)
```
