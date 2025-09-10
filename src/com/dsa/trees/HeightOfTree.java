package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/09/25
 */
public class HeightOfTree {

    // Function to calculate height (or max depth)
    public static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Height of Tree "+ height(root));
    }
}