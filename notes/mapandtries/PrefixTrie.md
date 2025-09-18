# Trie (Prefix Tree) - Explanation, Dry Run, and Complexity

A **Trie** (Prefix Tree) is a tree-like data structure used to store
strings efficiently, mainly for search and prefix-based queries.

------------------------------------------------------------------------

## 🔹 Operations in Trie

### 1. Insert

**Approach**: - Start at the root node. - For each character in the
word: - If the character node doesn't exist, create it. - Move to that
node. - After the last character, mark the node as `endOfWord`.

**Dry Run Example: Insert "apple"**

    root
     └─ a
         └─ p
             └─ p
                 └─ l
                     └─ e (isEndOfWord = true)

**Time Complexity**: O(L)\
**Space Complexity**: O(L) (new nodes may be created).

------------------------------------------------------------------------

### 2. Search (full word)

**Approach**: - Start at root, follow nodes for each character. - If a
character is missing → word not found. - At the end, check if
`isEndOfWord` is true.

**Dry Run Example: Search "apple"**

    root → a → p → p → l → e (isEndOfWord = true)

Result: Found ✅

**Time Complexity**: O(L)\
**Space Complexity**: O(1).

------------------------------------------------------------------------

### 3. Prefix Search (startsWith)

**Approach**: - Same as search, but we do not require `isEndOfWord` to
be true. - As long as traversal is possible, the prefix exists.

**Dry Run Example: startsWith("ap")**

    root → a → p → (stop here)

Result: Prefix exists ✅

**Time Complexity**: O(L)\
**Space Complexity**: O(1).

------------------------------------------------------------------------

### 4. Delete

**Approach**: - Traverse recursively. - At the last character: - If not
marked as word → return false (word doesn't exist). - If marked → unmark
it. - If node has no children, delete it. - Backtrack: - Remove child
nodes that are no longer needed. - Keep a node if it is still a prefix
for another word or marked as `endOfWord`.

**Dry Run Example: Delete "apple" when "app" exists**

Before deletion:

    root
     └─ a
         └─ p
             └─ p (isEndOfWord = true for "app")
                 └─ l
                     └─ e (isEndOfWord = true for "apple")

Steps: 1. Unmark `e` as end of word → delete `e`. 2. Backtrack: `l` has
no children → delete `l`. 3. Backtrack: second `p` still
`isEndOfWord = true` for "app", so stop.

After deletion:

    root
     └─ a
         └─ p
             └─ p (isEndOfWord = true for "app")

**Time Complexity**: O(L)\
**Space Complexity**: O(1) (ignoring recursion stack).

------------------------------------------------------------------------

## 🔹 Overall Time Complexity of Trie

-   **Insert**: O(L)\
-   **Search**: O(L)\
-   **StartsWith**: O(L)\
-   **Delete**: O(L)

Where **L = length of the word/prefix**.

## 🔹 Space Complexity

Worst case: **O(N × L)** where **N = number of words** and **L = max
word length**.

------------------------------------------------------------------------
