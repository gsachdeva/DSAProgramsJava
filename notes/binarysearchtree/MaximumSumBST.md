# Maximum Sum BST in Binary Tree (Explanation)

## Approach

1.  **Postorder Traversal**
    -   We process each node **after** visiting its left and right
        children.\
    -   For every node, we check if the subtree rooted at that node
        forms a **valid BST**.
2.  **Information to Track for Each Subtree**\
    For each node, return the following information upward:
    -   `isBST`: Whether the subtree is a BST.
    -   `min`: Minimum value in this subtree.
    -   `max`: Maximum value in this subtree.
    -   `sum`: Sum of all values in this subtree.
3.  **BST Validation**
    -   Left subtree must be BST.\
    -   Right subtree must be BST.\
    -   Node's value must be greater than `max` of left and less than
        `min` of right.
4.  **If Valid BST**
    -   Compute sum of left + right + current node.\
    -   Update global maximum sum if this sum is greater.
5.  **If Not BST**
    -   Return `isBST = false` for this node so parent ignores it.

------------------------------------------------------------------------

## Dry Run Example

Consider the tree:

            1
           /       4   3
         / \        2   4    5
                                   6

### Step by Step

-   Node `2`:
    -   Leaf → BST, sum = 2\
    -   Update maxSum = 2
-   Node `4` (right of 4):
    -   Leaf → BST, sum = 4\
    -   Update maxSum = 4
-   Node `4` (with children 2 and 4):
    -   Left max = 2, Right min = 4\
    -   Condition fails (because 4 !\< 4) → Not BST
-   Node `6`:
    -   Leaf → BST, sum = 6\
    -   Update maxSum = 6
-   Node `5`:
    -   Right child = 6, valid BST → sum = 11\
    -   Update maxSum = 11
-   Node `3`:
    -   Right child is BST, sum = 3 + 11 = 14\
    -   Update maxSum = 14
-   Node `1`:
    -   Left not BST, so fails → not considered

**Final Answer = 14**

------------------------------------------------------------------------

## Time Complexity

-   Each node is visited once.\
-   Work per node is O(1).\
-   **Time Complexity = O(n)** where `n` = number of nodes.

## Space Complexity

-   Recursive stack = O(h), where `h` is tree height.\
-   **Best case (balanced tree): O(log n)**\
-   **Worst case (skewed tree): O(n)**
