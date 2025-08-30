
# Largest Rectangle in Histogram - Step by Step Dry Run

We solve this using **Previous Smaller Element (PSE)** and **Next Smaller Element (NSE)**.

---

## Problem
Given heights of bars:  
`[2, 1, 5, 6, 2, 3]`  
Find the largest rectangle area.

---

## Step 1: Previous Smaller Element (PSE)
For each bar, find the index of the first smaller bar to the **left**.

- Start with empty stack, traverse left → right.
- If current bar is smaller, pop until valid.
- If stack empty → `-1`.

Result:  
`pse = [-1, -1, 1, 2, 1, 4]`

---

## Step 2: Next Smaller Element (NSE)
For each bar, find the index of the first smaller bar to the **right**.

- Start with empty stack, traverse right → left.
- If current bar is smaller, pop until valid.
- If stack empty → `n`.

Result:  
`nse = [1, 6, 4, 4, 6, 6]`

---

## Step 3: Calculate Area
Formula:  
```
Area[i] = heights[i] * (nse[i] - pse[i] - 1)
```

- For height `2` (i=0): width = 1-(-1)-1 = 1 → area = 2*1 = 2
- For height `1` (i=1): width = 6-(-1)-1 = 6 → area = 1*6 = 6
- For height `5` (i=2): width = 4-1-1 = 2 → area = 5*2 = 10 ✅
- For height `6` (i=3): width = 4-2-1 = 1 → area = 6*1 = 6
- For height `2` (i=4): width = 6-1-1 = 4 → area = 2*4 = 8
- For height `3` (i=5): width = 6-4-1 = 1 → area = 3*1 = 3

---

## Final Answer
Maximum Area = **10**
