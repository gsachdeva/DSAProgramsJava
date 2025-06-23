# Insertion Sort – Explanation and Dry Run

---

## 📄 Metadata

- **Author**: Gaurav Sachdeva
- **Date**: 23 June 2025
- **Description**: This document explains the Insertion Sort algorithm with dry run, approach, and complexity analysis.

---

## 🧠 Algorithm Approach

Insertion Sort builds a sorted array one element at a time:

1. Start with the second element (index 1), treating the first as sorted.
2. Take the current element (`key`) and compare it with the sorted part.
3. Shift elements in the sorted part that are greater than the key.
4. Insert the key in its correct position.
5. Repeat for all elements.

---

## 🔁 Dry Run

### Input:
`[5, 4, 3, 2, 1]`

### Step-by-step Process:

- **i = 1**, key = 4  
  Compare 4 < 5 → shift 5 → `[5, 5, 3, 2, 1]`  
  Insert 4 at index 0 → `[4, 5, 3, 2, 1]`

- **i = 2**, key = 3  
  Compare 3 < 5 → shift 5  
  Compare 3 < 4 → shift 4 → `[4, 5, 5, 2, 1]`  
  Insert 3 at index 0 → `[3, 4, 5, 2, 1]`

- **i = 3**, key = 2  
  Compare 2 < 5 → shift 5  
  Compare 2 < 4 → shift 4  
  Compare 2 < 3 → shift 3 → `[3, 4, 5, 5, 1]`  
  Insert 2 at index 0 → `[2, 3, 4, 5, 1]`

- **i = 4**, key = 1  
  Compare 1 < 5 → shift 5  
  Compare 1 < 4 → shift 4  
  Compare 1 < 3 → shift 3  
  Compare 1 < 2 → shift 2 → `[2, 3, 4, 5, 5]`  
  Insert 1 at index 0 → `[1, 2, 3, 4, 5]`

---

## ✅ Final Output

```
Sorted array: 1 2 3 4 5
```

---

## 📊 Time & Space Complexity

- **Best Case**: O(n) – when the array is already sorted
- **Average Case**: O(n²)
- **Worst Case**: O(n²) – when array is reverse sorted
- **Space Complexity**: O(1) – in-place sorting

---

## 🧩 When to Use

- Good for **small or nearly sorted** arrays
- Easy to implement and understand
- Suitable when **space is limited**
