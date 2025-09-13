package com.dsa.binarysearchtree;

public class LowestCommonAncestorBST {

    // Insert a value into the BST
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Recursive LCA function
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    // Inorder traversal to check BST structure
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        LowestCommonAncestorBST bst = new LowestCommonAncestorBST();

        // Build BST
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = null;
        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.print("Inorder Traversal: ");
        bst.inorder(root);
        System.out.println();

        // Test LCA
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        TreeNode lca = bst.lowestCommonAncestor(root, p, q);
        System.out.println("Recursive LCA of 2 and 8: " + lca.val);

        // Another test
        TreeNode p2 = new TreeNode(2);
        TreeNode q2 = new TreeNode(4);
        TreeNode lca2 = bst.lowestCommonAncestor(root, p2, q2);
        System.out.println("Recursive LCA of 2 and 4: " + lca2.val);
    }}