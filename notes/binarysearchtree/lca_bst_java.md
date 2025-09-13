# Lowest Common Ancestor (LCA) in BST - Java

## Problem
Find the **Lowest Common Ancestor (LCA)** of two nodes in a **Binary Search Tree (BST)**.

---

## Approach
1. **BST Property**: 
   - Left child < Root < Right child.
2. Start from root:
   - If both nodes are smaller → go **left**.
   - If both nodes are larger → go **right**.
   - Otherwise, current node is the **LCA**.


---

## Example Output
```
Inorder Traversal: 0 2 3 4 5 6 7 8 9 
Recursive LCA of 2 and 8: 6
Iterative LCA of 2 and 8: 6
Recursive LCA of 2 and 4: 2
```

---

✅ Both **recursive** and **iterative** solutions are provided.
