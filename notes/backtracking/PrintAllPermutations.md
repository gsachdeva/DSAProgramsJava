
# Print All Permutations – Recursion + Backtracking

## 🧠 Problem Statement

Generate and print **all permutations** of a given string using **recursion and backtracking**.

---

## 🏗️ Approach Overview

This algorithm uses **in-place character swapping** and **recursion** to explore all permutations of the input character array.

---

## 🔄 Algorithm Steps

1. **Start from the first index** of the character array.
2. Loop from the current index to the end of the array:
   - Swap the current index with the loop index to **fix one character**.
   - Recursively call the same function for the next index.
   - Swap back (backtrack) to **restore original state** for the next iteration.
3. When the index reaches the end of the array, print the current permutation.

---

## 📚 Concepts Used

- **Recursion** – To explore all branches of character arrangements.
- **Backtracking** – To undo changes and try the next possibility.
- **Swap Logic** – Used to rearrange characters in place.
- **String to Char Array** – Used because strings are immutable in Java.

---

## 💡 Time Complexity

- **O(n × n!)**
  - There are `n!` permutations, and each takes `O(n)` time to print/construct.

---

## 🧠 Why Backtracking?

Backtracking ensures that after exploring a permutation starting with a certain prefix, we **revert** the array back to its original state before exploring a new prefix.  
This avoids unwanted side-effects from previous recursive calls.
