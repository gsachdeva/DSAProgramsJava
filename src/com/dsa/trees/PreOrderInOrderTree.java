package com.dsa.trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Gaurav Sachdeva
 * Date: 06/09/25
 */

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class PreOrderInOrderTree {
    private int preorderIndex;
    private Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderMap = new HashMap<>();

        // Store inorder values with indices for fast lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right){
        // No elements to construct subtree
        if (left > right) return null;

        // Pick current root from preorder
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Build left and right subtrees
        int inorderIndex = inorderMap.get(rootVal);

        root.left = build(preorder, left, inorderIndex - 1);
        root.right = build(preorder, inorderIndex + 1, right);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        PreOrderInOrderTree sol = new PreOrderInOrderTree();
        TreeNode root = sol.buildTree(preorder, inorder);
        printInorder(root);
    }


    private static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}