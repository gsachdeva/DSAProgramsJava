# Binary Tree to Doubly Linked List (DLL)

## Approach

1.  **In-order Traversal**
    -   The doubly linked list should follow the **in-order traversal
        order** of the binary tree.
    -   Traverse the binary tree using in-order (Left → Root → Right).
2.  **Maintain Two Pointers**
    -   `prev`: Tracks the previously processed node in traversal.
    -   `head`: Tracks the head (first node) of the DLL.
3.  **Conversion Steps**
    -   If `prev` is `null`, it means current node is the leftmost node
        → assign it as `head` of DLL.
    -   Otherwise, link the current node with `prev`:
        -   `prev.right = current`
        -   `current.left = prev`
    -   Move `prev = current`.
4.  **Continue Recursively**
    -   Recur for left child.
    -   Process current node (linking step).
    -   Recur for right child.

------------------------------------------------------------------------

## Dry Run Example

Binary Tree:

             10
            /         5    20
          / \   /      2   8 15 25

### In-order Traversal

-   Left subtree → Root → Right subtree\
-   Sequence: `2 → 5 → 8 → 10 → 15 → 20 → 25`

### Step by Step

-   Visit `2`: `prev = null`, so `head = 2`
-   Visit `5`: link `2 <-> 5`
-   Visit `8`: link `5 <-> 8`
-   Visit `10`: link `8 <-> 10`
-   Visit `15`: link `10 <-> 15`
-   Visit `20`: link `15 <-> 20`
-   Visit `25`: link `20 <-> 25`

### Final DLL

    2 <-> 5 <-> 8 <-> 10 <-> 15 <-> 20 <-> 25

------------------------------------------------------------------------

## Time Complexity

-   Every node is visited once → **O(n)**\
-   Linking takes constant time per node.

## Space Complexity

-   Recursion stack depth = tree height = **O(h)**
    -   Best case (balanced tree): O(log n)\
    -   Worst case (skewed tree): O(n)
