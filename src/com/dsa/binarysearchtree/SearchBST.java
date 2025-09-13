package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 10/09/25
 */
public class SearchBST {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        int key1 = 60;


        System.out.println("Search " + key1 + " (Recursive): " + searchRecursive(tree.root, key1));
    }
    public static boolean searchRecursive(TreeNode tree,int key){
        if (tree == null) {
            return false; // base case: not found
        }

        if (tree.val == key) {
            return true; // found
        }

        if (key < tree.val) {
            return searchRecursive(tree.left, key); // search in left subtree
        } else {
            return searchRecursive(tree.right, key); // search in right subtree
        }

    }
}