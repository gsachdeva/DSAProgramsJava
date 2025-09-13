package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 11/09/25
 */
class KthSmallestBST {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }

    public static void main(String[] args) {
        // Example BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        KthSmallestBST obj = new KthSmallestBST();
        System.out.println("Kth Smallest = " + obj.kthSmallest(root, 3)); // Expected: 3
    }
}
