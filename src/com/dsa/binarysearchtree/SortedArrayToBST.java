package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 12/09/25
 */
public class SortedArrayToBST {

    // Function to convert sorted array to BST
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2; // middle element
        TreeNode node = new TreeNode(nums[mid]);

        node.left = buildBST(nums, left, mid - 1);   // left half
        node.right = buildBST(nums, mid + 1, right); // right half

        return node;
    }

    // Helper function to print inorder traversal of BST
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        SortedArrayToBST solution = new SortedArrayToBST();

        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("Inorder Traversal of BST:");
        solution.inorder(root);
    }
}