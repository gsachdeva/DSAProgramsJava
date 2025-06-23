# Bubble Sort in Java

This document explains the **Bubble Sort** algorithm with a step-by-step dry run and a clear approach.

---

## 🧠 Approach

1. **Compare Adjacent Elements**: Start from the beginning of the array and compare each pair of adjacent elements.
2. **Swap if Needed**: If the current element is greater than the next one, swap them.
3. **Repeat**: Continue this process for `n-1` passes (where `n` is the length of the array).
4. **Optimization**: Each pass places the next largest element at its correct position at the end.

---

## 🔁 Dry Run

### Input Array:
`[5, 4, 3, 2, 1]`

### Pass 1:
- Compare 5 and 4 → swap → `[4, 5, 3, 2, 1]`
- Compare 5 and 3 → swap → `[4, 3, 5, 2, 1]`
- Compare 5 and 2 → swap → `[4, 3, 2, 5, 1]`
- Compare 5 and 1 → swap → `[4, 3, 2, 1, 5]`

### Pass 2:
- Compare 4 and 3 → swap → `[3, 4, 2, 1, 5]`
- Compare 4 and 2 → swap → `[3, 2, 4, 1, 5]`
- Compare 4 and 1 → swap → `[3, 2, 1, 4, 5]`

### Pass 3:
- Compare 3 and 2 → swap → `[2, 3, 1, 4, 5]`
- Compare 3 and 1 → swap → `[2, 1, 3, 4, 5]`

### Pass 4:
- Compare 2 and 1 → swap → `[1, 2, 3, 4, 5]`

### Final Sorted Array:
`[1, 2, 3, 4, 5]`

---

## ✅ Output

```
Sorted array: 1 2 3 4 5
```

---

## 📊 Time & Space Complexity

- **Time Complexity**: O(n²) – Nested loops for comparisons
- **Space Complexity**: O(1) – In-place sorting

---

## 🧩 When to Use

- Best for small datasets
- Good for educational purposes to understand basic sorting
