# 🧠 Finding All Palindromic Substrings from a String (Java Logic)

## 🚀 Objective

To identify and print **all palindromic substrings** in a given string.

---

## 💡 What is a Palindrome?

A **palindrome** is a sequence of characters that reads the same forward and backward.

**Examples:**
- `"madam"`
- `"racecar"`
- `"a"`
- `"civic"`

---

## 🧭 Approach: Expand Around Center

The efficient way to solve this problem is using the **Expand Around Center** technique.

### 🔑 Key Idea:

- A string of length `n` can have `2n - 1` possible centers:
    - `n` odd-length centers (single characters)
    - `n - 1` even-length centers (between characters)

- For each center, expand outward while the characters at `left` and `right` are the same.

---

## 🔍 Steps:

1. Loop through each index of the string.
2. For each index, treat it as a center:
    - Expand to find **odd-length** palindromes (center at one character).
    - Expand to find **even-length** palindromes (center between two characters).
3. While characters at `left` and `right` are the same:
    - It is a palindrome — store or print it.
    - Move `left--` and `right++`.
4. Repeat for all indices.

---

## 🧪 Dry Run Example

Let’s take `input = "madamracecar"`:

### Iteration 1 (i = 0):
- Center = `'m'`
    - Expand: `'m'` → palindrome

### Iteration 2 (i = 1):
- Center = `'a'`
    - Expand: `'a'` → palindrome
    - Expand: `'ada'` → palindrome

### Iteration 3 (i = 2):
- Center = `'d'`
    - Expand: `'d'` → palindrome
    - `'ada'` already found

### Iteration 4 (i = 3):
- Center = `'a'`
    - Expand: `'a'` → palindrome

### Iteration 5 (i = 4):
- Center = `'m'`
    - Expand: `'m'` → palindrome
    - Expand: `'madam'` → palindrome

### Iteration 6–11: Continue this process and find:
- `'r'`, `'a'`, `'c'`, `'e'`, `'cec'`, `'racecar'`, etc.

---

## ✅ Output Substrings (from `"madamracecar"`):

