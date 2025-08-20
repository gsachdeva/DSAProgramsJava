# Find Middle Node of a Linked List

Finding the **middle node** of a linked list is a very common interview problem.  

---

## 1. Slow and Fast Pointer Approach (Optimal, O(n))

- Use two pointers:  
  - **slow** → moves one step at a time  
  - **fast** → moves two steps at a time  

- When `fast` reaches the end, `slow` will be at the **middle node**.

- Works in **one traversal (O(n))** and uses **O(1) extra space**.

### Behavior:
- If the list has **odd nodes** → `slow` points to the exact middle.  
- If the list has **even nodes** → depending on the requirement, you can return the **first middle** or **second middle**.

---

## 2. Count Method (Less Optimal, O(2n))

1. Traverse the list once to count the total nodes.  
2. Traverse again to reach the `(count / 2)`-th node.  

- This approach takes **two passes** (O(2n)) compared to the single-pass slow-fast method.

---

## Example Dry Run (for list `1 → 2 → 3 → 4 → 5`)

- Step 1: `slow = 1`, `fast = 1`  
- Step 2: `slow = 2`, `fast = 3`  
- Step 3: `slow = 3`, `fast = 5`  
- Step 4: `fast` reaches null → **`slow = 3` is the middle node** ✅

---

## Comparison

| Approach              | Time Complexity | Space Complexity | Notes |
|-----------------------|----------------|------------------|-------|
| Slow & Fast Pointer   | O(n)           | O(1)             | ✅ Best, single pass |
| Count Method          | O(2n)          | O(1)             | ❌ Less efficient |

---

## Key Takeaway

👉 In interviews, always prefer the **Slow and Fast pointer method** since it’s more efficient and elegant.
