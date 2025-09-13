package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 10/09/25
 */
public class FindMinBST {

    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Minimum value in BST: " + findMin(tree.root));
    }
    // Find Minimum value in BST
    public static int findMin(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}