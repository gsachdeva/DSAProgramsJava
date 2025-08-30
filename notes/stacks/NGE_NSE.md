# Next Greater Element (NGE) & Next Smaller Element (NSE)

This document explains the concepts of **Next Greater Element (NGE)**
and **Next Smaller Element (NSE)** using dry runs and stack-based logic.

------------------------------------------------------------------------

## 🔹 Next Greater Element (NGE)

For each element, find the **next greater element** to its right.\
If none exists → `-1`.

### Example

Array: `[4, 8, 5, 2, 25]`\
Result: `[8, 25, 25, 25, -1]`

### Dry Run (NGE)

  -------------------------------------------------------------------------------
  i   arr\[i\]   Action                                result\[i\]   Stack after
  --- ---------- ------------------------------------- ------------- ------------
  4   25         Stack empty → -1, push 25             -1            \[25\]

  3   2          Top=25\>2 → ans=25, push 2            25            \[25, 2\]

  2   5          Pop 2 (≤5), top=25\>5 → ans=25, push  25            \[25, 5\]
                 5                                                   

  1   8          Pop 5 (≤8), top=25\>8 → ans=25, push  25            \[25, 8\]
                 8                                                   

  0   4          Top=8\>4 → ans=8, push 4              8             \[25, 8, 4\]
  -------------------------------------------------------------------------------

Final NGE = `[8, 25, 25, 25, -1]`

------------------------------------------------------------------------

## 🔹 Next Smaller Element (NSE)

For each element, find the **next smaller element** to its right.\
If none exists → `-1`.

### Example

Array: `[4, 8, 5, 2, 25]`\
Result: `[2, 5, 2, -1, -1]`

### Dry Run (NSE)

  --------------------------------------------------------------------------------
  i   arr\[i\]   Action                                 result\[i\]   Stack after
  --- ---------- -------------------------------------- ------------- ------------
  4   25         Stack empty → -1, push 25              -1            \[25\]

  3   2          Pop 25 (≥2), empty → -1, push 2        -1            \[2\]

  2   5          Top=2\<5 → ans=2, push 5               2             \[2, 5\]

  1   8          Top=5\<8 → ans=5, push 8               5             \[2, 5, 8\]

  0   4          Pop 8, pop 5, top=2\<4 → ans=2, push 4 2             \[2, 4\]
  --------------------------------------------------------------------------------

Final NSE = `[2, 5, 2, -1, -1]`

------------------------------------------------------------------------

## 🔹 Key Differences

-   **NGE →** Pop while `stack.peek() <= arr[i]`
-   **NSE →** Pop while `stack.peek() >= arr[i]`

Both problems follow the same **monotonic stack** template, with only
the comparison sign changing.

------------------------------------------------------------------------

## 🔹 Summary

-   Traverse from **right → left**
-   Use a stack to maintain candidates
-   Answer comes from the top of stack (or -1 if empty)
-   NGE and NSE are building blocks for bigger problems:
    -   Stock Span Problem\
    -   Largest Rectangle in Histogram\
    -   Monotonic Stack problems

------------------------------------------------------------------------
