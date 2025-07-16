
# 📘 Single Non-Duplicate Element Using Binary Search

## 🔍 Problem Statement

You are given a **sorted array** where every element appears **exactly twice**, except for **one element** which appears **only once**. Your task is to find that single non-duplicate element using **binary search** in **O(log n)** time.

---

## 🧠 Key Observations

- The array is sorted.
- All elements appear in **pairs** except one.
- The **positioning of the pairs** can help guide binary search.

---

## ⚙️ Binary Search Strategy

1. Use two pointers: `low` and `high`.
2. Pick the middle index: `mid = (low + high) / 2`.
3. Use the bitwise XOR trick: `mid ^ 1`
   - If `mid` is **even**, `mid ^ 1 = mid + 1`
   - If `mid` is **odd**, `mid ^ 1 = mid - 1`
   - This gives the **index of the pair** of the current element.
4. If `nums[mid] == nums[mid ^ 1]`, then:
   - The unique element is in the **right half**, move `low = mid + 1`.
5. If not:
   - The unique element is in the **left half**, move `high = mid - 1`.
6. Loop until `low` crosses `high`. The unique element is at `nums[low]`.

---

## 🧪 Example

Input:
```
[1, 1, 2, 3, 3, 4, 4, 8, 8]
```

Steps:
- Check mid and its pair.
- Narrow down the half where the unique element lies.
- Eventually, you land on `2` as the single element.

---

## ✅ Time and Space Complexity

- **Time:** O(log n)
- **Space:** O(1)
