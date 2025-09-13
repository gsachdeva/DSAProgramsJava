# Delete Node in a Binary Search Tree (BST)

Deleting a node from a Binary Search Tree involves **three main cases**
depending on the structure of the node being deleted.

------------------------------------------------------------------------

## 1. Case 1: Node has **no children** (Leaf Node)

-   Simply remove the node from the tree.\

-   Example: Deleting `20` from

              30
             /       20    40

    Result:

              30
                           40

------------------------------------------------------------------------

## 2. Case 2: Node has **one child**

-   Replace the node with its child.\

-   Example: Deleting `30` when it has only a right child `40`:

              30
                           40

    Result:

              40

------------------------------------------------------------------------

## 3. Case 3: Node has **two children**

-   Find the **inorder successor** (smallest value in the right
    subtree)\
    OR the **inorder predecessor** (largest value in the left subtree).\
-   Replace the node's value with the successor/predecessor value.\
-   Delete that successor/predecessor node.

### Example:

Deleting `50` from

            50
           /       30    70
        / \   /    20 40 60 80

-   Inorder successor of `50` = `60`\
-   Replace `50` with `60`\
-   Delete original `60`

Result:

            60
           /       30    70
        / \        20 40     80

------------------------------------------------------------------------

## Key Points

-   **Leaf node** → remove directly.\
-   **One child** → replace node with its child.\
-   **Two children** → replace with inorder successor/predecessor, then
    delete it.\
-   Maintains BST property after deletion.
