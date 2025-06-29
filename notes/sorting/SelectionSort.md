# Selection Sort Explained

## 🔍 What is Selection Sort?

Selection Sort is a simple and intuitive sorting algorithm. It works by dividing the input array into two parts:

1. The subarray which is already sorted.
2. The remaining subarray which is unsorted.

The algorithm repeatedly selects the **smallest (or largest)** element from the unsorted subarray and moves it to the end of the sorted subarray.

---

## ✅ Approach

1. Start with the first element; assume it is the minimum.
2. Compare this element with the rest of the array to find the actual minimum.
3. Once found, swap it with the first element.
4. Move the boundary of the sorted and unsorted subarray one step to the right.
5. Repeat until the array is sorted.

---

## 📉 Dry Run Example

**Input Array:**

```
[29, 10, 14, 37, 14]
```

### Pass 1:

- Start from index `0`. Minimum = `29`
- Compare with 10 → New minimum = 10
- Compare with 14 → still 10
- Compare with 37 → still 10
- Compare with 14 → still 10
- Swap 29 and 10 → `[10, 29, 14, 37, 14]`

### Pass 2:

- Start from index `1`. Minimum = `29`
- Compare with 14 → New minimum = 14
- Compare with 37 → still 14
- Compare with 14 → still 14
- Swap 29 and 14 → `[10, 14, 29, 37, 14]`

### Pass 3:

- Start from index `2`. Minimum = `29`
- Compare with 37 → still 29
- Compare with 14 → New minimum = 14
- Swap 29 and 14 → `[10, 14, 14, 37, 29]`

### Pass 4:

- Start from index `3`. Minimum = `37`
- Compare with 29 → New minimum = 29
- Swap 37 and 29 → `[10, 14, 14, 29, 37]`

**Final Sorted Array:**

```
[10, 14, 14, 29, 37]
```

---

## 📊 Time and Space Complexity

| Case    | Time Complexity |
| ------- | --------------- |
| Best    | O(n²)           |
| Average | O(n²)           |
| Worst   | O(n²)           |

- **Space Complexity:** O(1) — it sorts the array in-place
- **Stable:** No (can be modified to be stable)

---

## ☑️ When to Use

- For small datasets.
- When memory write operations are costly and fewer swaps are desired.

---

## 🧠 Fun Insight

Although inefficient for large arrays, **Selection Sort performs the minimum number of swaps (O(n))** among all simple sorting algorithms, making it useful in memory-constrained systems.

