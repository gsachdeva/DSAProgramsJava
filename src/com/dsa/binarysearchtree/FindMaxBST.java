package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 10/09/25
 */
public class FindMaxBST {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Max value in BST: " + findMaxRecursion(tree.root));
    }
    // Find Minimum value in BST
    public static int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    // Find Minimum value in BST
    public static int findMaxRecursion(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        if (root.right == null) {
            return root.val;  // rightmost node
        }
        return findMaxRecursion(root.right);
    }
}