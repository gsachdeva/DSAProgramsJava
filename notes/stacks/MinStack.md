# Minimum Element in Stack (Approach 2 – Using Auxiliary Stack / ArrayList)

## Problem
Design a stack that, in addition to standard operations (`push`, `pop`, `top`), can return the **minimum element** in **O(1)** time.

---

## Idea
- Use two structures:
    - **Main Stack**: Stores all values.
    - **Min Stack (or ArrayList)**: Stores the minimum values up to that point.

---

## Algorithm (Using ArrayList as Min Stack)
1. **Push(x)**
    - Add `x` to the main stack.
    - If min list is empty OR `x <= last min`, also add `x` to min list.

2. **Pop()**
    - Remove element from main stack.
    - If the popped element is equal to the last element in min list, also remove from min list.

3. **GetMin()**
    - Return the last element from min list.

---

## Example

### Input
Push: [5, 2, 8, 1, 3]  
Operations:
- Push 5
- Push 2
- Push 8
- Push 1
- Pop
- GetMin

### Dry Run

| Step   | Main Stack       | Min List        | Min |
|--------|------------------|-----------------|-----|
| Push 5 | [5]              | [5]             | 5   |
| Push 2 | [5, 2]           | [5, 2]          | 2   |
| Push 8 | [5, 2, 8]        | [5, 2]          | 2   |
| Push 1 | [5, 2, 8, 1]     | [5, 2, 1]       | 1   |
| Pop    | [5, 2, 8]        | [5, 2]          | 2   |

### Output
Minimum = 2

---

## Complexity
- **Push**: O(1)
- **Pop**: O(1)
- **GetMin**: O(1)
- **Space**: O(n) (because of extra min list)

