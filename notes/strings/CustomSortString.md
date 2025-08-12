# Custom Sort String – Explanation and Approach

## 🧠 Problem Overview

You are given two strings:

- `order`: A string representing a custom character order.
- `s`: A target string that you need to sort based on the order defined in `order`.

**Goal:** Rearrange `s` so characters follow the order in `order`. Characters not in `order` can appear anywhere after the ordered ones.

---

## ✅ Approach (Comparator-Based Sorting)

1. **Map Priorities:**  
   Create a hash map that maps each character in `order` to its index. This gives us a custom sorting priority.

2. **Sort Characters:**  
   Convert the target string `s` into a list or array of characters. Use a custom comparator to sort them using the priority map.  
   Characters not present in `order` are given a very large priority (`Integer.MAX_VALUE`) so they move to the end.

3. **Rebuild String:**  
   After sorting, rebuild the result using a StringBuilder or similar.

---

## 🔍 Dry Run Example

### Input:
```
order = "cba"
s = "abcd"
```

### Step-by-Step:

**Priority Map:**
```
'c' → 0
'b' → 1
'a' → 2
```

**Original Characters in `s`:**  
```
['a', 'b', 'c', 'd']
```

**Comparisons:**
- Compare `a` vs `b` → 2 vs 1 → `b` comes first
- Compare `b` vs `c` → 1 vs 0 → `c` comes first
- `d` is not in the order map → gets pushed to the end

**Sorted Characters:**
```
['c', 'b', 'a', 'd']
```

**Final Output:**
```
"cbad"
```

---

## ⏱️ Time & Space Complexity

- **Time:** O(n log n) due to sorting
- **Space:** O(n) for character array and result string

---

## ✅ Notes

- This approach is clean and flexible but not the most efficient.
- For highest performance (beating 90%+), use a **frequency-count-based O(n)** method instead.