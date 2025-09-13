# Explanation of reverseInorder in BST to GST

The `reverseInorder` method is used to convert a Binary Search Tree
(BST) into a Greater Sum Tree (GST).\
It works by performing a **reverse inorder traversal** (right → root →
left).

------------------------------------------------------------------------

## 🔹 Why Reverse Inorder?

-   A normal inorder traversal (left → root → right) of a BST gives
    values in **ascending order**.\
-   A reverse inorder traversal (right → root → left) gives values in
    **descending order**.\
-   Since we need each node to hold the **sum of all greater values**,
    we must process **larger nodes first**.

------------------------------------------------------------------------

## 🔹 Steps of the Algorithm

1.  **Go right** → Traverse the right subtree (all greater values).\
2.  **Process current node** →
    -   Add its value to a running `sum`.\
    -   Replace the node's value with this `sum`.\
3.  **Go left** → Traverse the left subtree (smaller values).

------------------------------------------------------------------------

## 🔹 Dry Run Example

Consider the tree:

          4
         /     1   6

### Initial: `sum = 0`

1.  Start at root `4`, move right → `6`.
    -   Visit `6`:
        -   `sum = 0 + 6 = 6`\
        -   Node `6` becomes `6`
2.  Back to root `4`:
    -   `sum = 6 + 4 = 10`\
    -   Node `4` becomes `10`
3.  Move left → `1`:
    -   Visit `1`:
        -   `sum = 10 + 1 = 11`\
        -   Node `1` becomes `11`

------------------------------------------------------------------------

## 🔹 Final GST Tree

         10
        /    11    6

Inorder traversal after transformation:

    11, 10, 6

------------------------------------------------------------------------

## 🔑 Key Points

-   **Right subtree first** → ensures we handle all larger values before
    the current node.\
-   **Update node value with running sum** → guarantees correct GST
    conversion.\
-   **Left subtree last** → smaller values are updated after greater
    ones.
