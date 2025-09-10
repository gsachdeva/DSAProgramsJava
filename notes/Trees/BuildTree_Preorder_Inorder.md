# Build Binary Tree from Preorder and Inorder Traversals

## Problem
Given two arrays:
- **Preorder traversal** (Root → Left → Right)
- **Inorder traversal** (Left → Root → Right)

Reconstruct the binary tree.

---

## Approach
1. The first element in **preorder** is the root.
2. Find that root’s index in **inorder**.
   - Elements to the left → Left subtree
   - Elements to the right → Right subtree
3. Recurse for left and right subtrees.
4. Use a hashmap to store inorder indices for O(1) lookup.


---

## Example
**Input:**
```
preorder = [3,9,20,15,7]
inorder  = [9,3,15,20,7]
```

**Output Tree:**
```
        3
       / \
      9   20
         /  \
        15   7
```
