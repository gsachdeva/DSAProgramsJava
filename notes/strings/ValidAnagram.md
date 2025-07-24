
# ✅ Efficient Anagram Check in Java (Lowercase Letters Only)

## 🔍 Problem
Check whether two strings are valid anagrams of each other using the most efficient method for lowercase English letters (`a–z`).

```

---

## ✅ Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## ✅ Notes
- This method assumes both strings contain only lowercase letters (a-z).
- Modify the array size if working with other character sets.

---

## 🧠 Approach

1. **Check Length:**  
   If lengths of the strings `s` and `t` are different, they can’t be anagrams. Return `false`.

2. **Create a Count Array:**  
   Use an integer array `count[26]` to keep track of character frequencies.  
   Each index corresponds to a character from `'a'` to `'z'`.

3. **Count Frequencies:**
    - For each character in string `s`, increment the corresponding index.
    - For each character in string `t`, decrement the corresponding index.

4. **Check Final Counts:**  
   If all values in the count array are `0`, then `s` and `t` have exactly the same characters in the same frequencies — they are anagrams.

---

## 🔁 Dry Run

### Input:
```
s = "anagram"
t = "nagaram"
```

### Step-by-step:

1. Initialize `count[26] = {0, 0, ..., 0}`
2. Loop through each character in `s` and `t` simultaneously:

| i | s.charAt(i) | t.charAt(i) | count[] change |
|---|-------------|-------------|----------------|
| 0 | a           | n           | a+1, n-1        |
| 1 | n           | a           | n+1, a-1        |
| 2 | a           | g           | a+1, g-1        |
| 3 | g           | a           | g+1, a-1        |
| 4 | r           | r           | r+1, r-1        |
| 5 | a           | a           | a+1, a-1        |
| 6 | m           | m           | m+1, m-1        |

3. Final `count[]` = all zero → ✅ `true` (anagram)

---

