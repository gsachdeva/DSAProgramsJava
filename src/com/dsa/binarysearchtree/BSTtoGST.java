package com.dsa.binarysearchtree;

import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 11/09/25
 */

public class BSTtoGST {
    private int sum = 0;

    // Iterative version without recursion
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Traverse right subtree first
            while (curr != null) {
                stack.push(curr);
                curr = curr.right;
            }

            // Process current node
            curr = stack.pop();
            sum += curr.val;
            curr.val = sum;

            // Move to left subtree
            curr = curr.left;
        }
        return root;
    }
    // --- For Testing ---
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BSTtoGST obj = new BSTtoGST();

        // Example Tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        obj.bstToGst(root);

        System.out.print("Inorder of GST: ");
        obj.inorder(root); // Should print transformed values
    }
}
