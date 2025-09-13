package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 10/09/25
 */

// BST Implementation
class BST {
    TreeNode root;
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root); // Output: 20 30 40 50 60 70 80
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
    // Insert a value into BST
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root; // unchanged root pointer
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal (Root -> Left -> Right)
    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal (Left -> Right -> Root)
    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
}
