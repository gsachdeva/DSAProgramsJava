# Sliding Window Maximum (Max of Subarrays)

## 📌 Problem
Given an array `arr[]` of size `n` and a number `k`, find the maximum element for each contiguous subarray of size `k`.

---

## 🧠 Intuition
We use a **Deque (double-ended queue)** to keep track of **indexes of useful elements** in every window.

- The front of the deque (`peekFirst`) always holds the **index of the maximum** in the current window.
- Remove elements from the back (`pollLast`) if the current element is **greater**, because they can never be the maximum.
- Remove elements from the front (`pollFirst`) if they are **out of the current window**.

👉 Think of it like a line of people:
- When a **taller person enters**, all shorter people behind him leave the line.
- The **front of the line** always has the tallest person (max).

---

## 🔑 Steps
1. Create a deque `dq` to store indexes.
2. Process the first `k` elements:
    - Remove smaller elements from the back.
    - Add the current element’s index at the back.
3. For the rest of the array:
    - Add the maximum (front of deque) to result.
    - Remove elements that are out of the window.
    - Remove smaller elements from the back.
    - Add the current element’s index at the back.
4. After the loop, add the max for the last window.

---

## 🏃 Dry Run Example
Array: `[1, 3, 2, 1, 7, 3]`, `k = 3`

| Step | Window       | Deque (indexes → values) | Max |
|------|-------------|---------------------------|-----|
| Init | `[1,3,2]`   | [1 → 3, 2 → 2]            | 3   |
| 1    | `[3,2,1]`   | [1 → 3, 2 → 2, 3 → 1]     | 3   |
| 2    | `[2,1,7]`   | [4 → 7]                   | 7   |
| 3    | `[1,7,3]`   | [4 → 7, 5 → 3]            | 7   |

✅ Result = `[3, 3, 7, 7]`