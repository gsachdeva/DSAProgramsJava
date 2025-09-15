# Smallest Range in K Lists (Java)

This program finds the **smallest range** that includes at least one
element from each of the K sorted lists.

------------------------------------------------------------------------

## 📌 Approach

1.  Use a **min heap** (priority queue) to always get the smallest
    element among the current picked elements.
2.  Keep track of the **maximum element** among the picked elements.
3.  Push the **first element** of each list into the heap.
4.  Repeatedly pop the smallest element, update the range, and push the
    next element from the same list.
5.  Stop when one of the lists gets exhausted.

------------------------------------------------------------------------


## 📝 Example Input

    List1 = [4, 10, 15, 24, 26]
    List2 = [0, 9, 12, 20]
    List3 = [5, 18, 22, 30]

## ✅ Output

    Smallest Range: [20, 24]

------------------------------------------------------------------------

## 🔎 Dry Run (Heap Evolution)

### Initial State

Heap = \[0 (List2), 4 (List1), 5 (List3)\]\
Max = 5\
Range = \[0, 5\]

### Step by Step

1.  Pop 0 → push 9 → Heap = \[4, 5, 9\], Max = 9 → Range = \[4, 9\]\
2.  Pop 4 → push 10 → Heap = \[5, 9, 10\], Max = 10 → Range = \[5, 10\]\
3.  Pop 5 → push 18 → Heap = \[9, 10, 18\], Max = 18 → Range = \[9,
    18\]\
4.  Pop 9 → push 12 → Heap = \[10, 12, 18\], Max = 18 → Range = \[10,
    18\]\
5.  Pop 10 → push 15 → Heap = \[12, 15, 18\], Max = 18 → Range = \[12,
    18\]\
6.  Pop 12 → push 20 → Heap = \[15, 18, 20\], Max = 20 → Range = \[15,
    20\]\
7.  Pop 15 → push 24 → Heap = \[18, 20, 24\], Max = 24 → Range = \[18,
    24\]\
8.  Pop 18 → push 22 → Heap = \[20, 22, 24\], Max = 24 → ✅ Best Range =
    \[20, 24\]\
9.  Pop 20 → List2 exhausted → Stop.

### Final Answer

    Smallest Range: [20, 24]

------------------------------------------------------------------------
