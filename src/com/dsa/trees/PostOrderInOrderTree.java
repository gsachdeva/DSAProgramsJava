package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 06/09/25
 */
import java.util.*;

class PostOrderInOrderTree {
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        Map<Integer, Integer> valMap = new HashMap<>();

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            valMap.put(inorder[i], i);
        }

        return constructTree(postorder, inorder, 0, inorder.length - 1, valMap);
    }

    private TreeNode constructTree(int[] postorder, int[] inorder,
                                   int inorderStart, int inorderEnd,
                                   Map<Integer, Integer> valMap) {
        if (postIndex < 0 || inorderStart > inorderEnd) {
            return null;
        }

        // Root from postorder
        int element = postorder[postIndex--];
        TreeNode root = new TreeNode(element);

        // Find position in inorder
        int inorderIndex = valMap.get(element);

        // Build subtrees: right first, then left
        root.right = constructTree(postorder, inorder, inorderIndex + 1, inorderEnd, valMap);
        root.left  = constructTree(postorder, inorder, inorderStart, inorderIndex - 1, valMap);

        return root;
    }

        public static void main(String[] args) {
            PostOrderInOrderTree sol = new PostOrderInOrderTree();

            int[] postOrder = {3, 9, 20, 15, 7};
            int[] inorder = {9, 3, 15, 20, 7};

            TreeNode root = sol.buildTree(postOrder, inorder);

            printInorder(root);
        }

        private static void printInorder(TreeNode node) {
            if (node == null) return;
            printInorder(node.left);
            System.out.print(node.val + " ");
            printInorder(node.right);
        }
    
}
