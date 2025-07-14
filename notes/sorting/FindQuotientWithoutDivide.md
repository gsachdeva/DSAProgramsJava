# 🧮 Find Quotient Using Binary Search (Without `/`, `*`, `%`)

---

## 📘 Problem Statement

Given two integers `dividend` and `divisor`, compute the **integer quotient** (floor division result) without using:

- Division operator `/`
- Multiplication operator `*`
- Modulo operator `%`

---

### 📥 Example

**Input:**
```
dividend = 10
divisor = 3
```

**Output:**
```
3
```

Explanation: The floor of `10 / 3` is `3`.

---

## 🧠 Core Idea

The goal is to find the **maximum integer `mid`** such that:
```
mid × divisor ≤ dividend
```

But since `mid * divisor` can overflow, we **reframe** the condition:
```
mid ≤ dividend / divisor
```

This allows us to safely apply **binary search** between the range:
```
start = 0
end = absolute(dividend)
```

---

## 🔍 Binary Search Logic

1. **Edge Case Handling**
   - If `divisor == 0` → return `LLONG_MAX`
   - If `dividend == 0` → return `0`

2. **Track Sign**
   - Use XOR logic to determine if the final result should be negative:
     ```cpp
     isNegative = (dividend < 0) ^ (divisor < 0)
     ```

3. **Convert to Long Long**
   - Convert both numbers to `long long` and use absolute values to avoid overflow.

4. **Binary Search Loop**
   - At each iteration, compute `mid = (left + right) / 2`
   - Check:
     - If `mid ≤ dividend / divisor`, then update `result = mid` and search in the right half.
     - Else, search in the left half.

5. **Apply Sign**
   - Apply `-` if the result should be negative.

---

## 🧪 Dry Run: `dividend = 10`, `divisor = 3`

| left | right | mid | mid * 3 | Condition         | result |
|------|-------|-----|----------|-------------------|--------|
| 0    | 10    | 5   | 15       | too high → left   |        |
| 0    | 4     | 2   | 6        | valid → go right  | 2      |
| 3    | 4     | 3   | 9        | valid → go right  | 3      |
| 4    | 4     | 4   | 12       | too high → left   | 3      |

Final result = **3**

---

## ⏱ Time Complexity

```
O(log(dividend))
```

## 💾 Space Complexity

```
O(1)
```

---

## 🚫 Edge Cases to Handle

- `divisor = 0` → undefined (return `INT_MAX`)
- `dividend = 0` → result is `0`
- `dividend = INT_MIN` and `divisor = -1` → overflow (return `INT_MAX`)
