# Leetcode 890 – Find and Replace Pattern

### 🧩 Problem Statement

You are given a list of words and a pattern. Return a list of words that match the same pattern.

Two strings match the same pattern if there exists a **bijection** between characters of the pattern and characters of the word.

---

### 🔍 Intuition

We need to find out if each word follows the **same structural pattern** as the given string. The key observation is:

- The **positions and repetitions** of characters matter.
- If we can **normalize** the pattern and the words in the same format (e.g., turning `'abb'` → `'011'`), we can just compare the normalized values.

---

### ✅ Approach: Normalize & Compare

1. **Normalization**: Convert each word and the pattern into a string representation based on **first occurrences** of each character.
   - `'abb'` → `'011'`
   - `'mee'` → `'011'` ✅
   - `'abc'` → `'012'` ❌
2. Compare normalized form of each word with the normalized form of the pattern.
3. If equal, include the word in the result.

---

### 🧪 Dry Run

#### Input:
```text
words = ["abc", "deq", "mee", "aqq", "dkd", "ccc"]
pattern = "abb"
```

#### Step 1: Normalize Pattern

- Pattern = `"abb"`
  - `'a'` → 0
  - `'b'` → 1
  - `'b'` → 1
- Normalized = `"011"`

#### Step 2: Normalize and Compare Each Word

| Word   | Normalization | Match with `"011"`? | Result |
|--------|----------------|----------------------|--------|
| "abc"  | `"012"`         | ❌ No                | ✘      |
| "deq"  | `"012"`         | ❌ No                | ✘      |
| "mee"  | `"011"`         | ✅ Yes               | ✔      |
| "aqq"  | `"011"`         | ✅ Yes               | ✔      |
| "dkd"  | `"010"`         | ❌ No                | ✘      |
| "ccc"  | `"000"`         | ❌ No                | ✘      |

---

### ✅ Final Output

```text
["mee", "aqq"]
```
