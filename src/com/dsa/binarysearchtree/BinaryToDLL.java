package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 13/09/25
 */

class DLLSolution {
    TreeNode prev = null;   // Keeps track of previously visited node
    TreeNode head = null;   // Head of the DLL

    // Convert Binary Tree to DLL
    public TreeNode bToDLL(TreeNode root) {
        if (root == null) return null;

        // In-order traversal (Left → Root → Right)
        bToDLL(root.left);

        // Process current node
        if (prev == null) {
            head = root;   // First node becomes head
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root; // Move prev pointer

        bToDLL(root.right);

        return head;
    }
}

public class BinaryToDLL {
    public static void main(String[] args) {
        /*
                 10
                /  \
               5    20
              / \   / \
             2   8 15 25
        */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        DLLSolution sol = new DLLSolution();
        TreeNode head = sol.bToDLL(root);

        // Print DLL
        System.out.print("Doubly Linked List: ");
        TreeNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }
}
