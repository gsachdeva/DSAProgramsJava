# Store Suggestion Trie

## Approach

A Store Suggestion Trie is a specialized Trie (Prefix Tree) used for **autocomplete or search suggestions** in e-commerce or other store-related applications. It allows fast insertion and retrieval of strings (e.g., product names) based on their prefixes.

The idea is to break down each word into characters and store them in a tree-like structure where each node represents a character. This makes prefix search efficient.

## Dry Run

* Insert: `"apple"`

    * Create path: a -> p -> p -> l -> e (mark `e` as end)
* Insert: `"app"`

    * Reuse path: a -> p -> p (mark `p` as end)
* Search: `"app"` → Found
* Search: `"appl"` → Not Found
* Prefix check: `"ap"` → True

## Time Complexity

* **Insertion:** O(m), where m = length of word
* **Search:** O(m)
* **Prefix Check:** O(m)

## Space Complexity

* O(N \* M), N = number of words, M = average length of words
