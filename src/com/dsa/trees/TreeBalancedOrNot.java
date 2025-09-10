package com.dsa.trees;// Java program to check if a tree is height-balanced or not
// Using Top Down Recursion

class TreeBalancedOrNot {

    // Function to calculate the height of a tree
    static int height(Node node) {

        // Base case: Height of empty tree is zero
        if (node == null)
            return 0;

        // Height = 1 + max of left height and right heights
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Function to check if the binary tree with given root is height-balanced
    static boolean isBalanced(Node root) {
        // If tree is empty then return true
        if (root == null)
            return true;

        // Get the height of left and right subtrees
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        // If absolute height difference is greater than 1
        // Then return false
        if (Math.abs(lHeight - rHeight) > 1)
            return false;

        // Recursively check the left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        // Representation of input BST:
        //            1
        //           / \
        //          2   3
        //         /  \
        //        4   5
        //       /
        //      8
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(isBalanced(root) ? "True" : "False");
    }
}