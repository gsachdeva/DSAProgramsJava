# Build Binary Tree from Postorder and Inorder Traversals

## Problem
Given two arrays:
- **Postorder traversal** (Left → Right → Root)
- **Inorder traversal** (Left → Root → Right)

Reconstruct the binary tree.

---

## Approach
1. The last element in **postorder** is the root.
2. Find that root’s index in **inorder**.
   - Elements to the left → Left subtree
   - Elements to the right → Right subtree
3. Recurse for left and right subtrees.
4. Use a hashmap to store inorder indices for O(1) lookup.
5. Important: build **right subtree first** (since postorder consumes root after right).

---


## Example
**Input:**
```
inorder   = [9,3,15,20,7]
postorder = [9,15,7,20,3]
```

**Output Tree:**
```
        3
       / \
      9   20
         /  \
        15   7
```
