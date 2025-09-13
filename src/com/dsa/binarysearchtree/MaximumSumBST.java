package com.dsa.binarysearchtree;

/**
 * Author: Gaurav Sachdeva
 * Date: 13/09/25
 */

class Solution {
    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private class NodeInfo {
        boolean isBST;
        int min, max, sum;
        NodeInfo(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    private NodeInfo dfs(TreeNode node) {
        if (node == null) {
            return new NodeInfo(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        NodeInfo left = dfs(node.left);
        NodeInfo right = dfs(node.right);

        if (left.isBST && right.isBST && node.val > left.max && node.val < right.min) {
            int sum = left.sum + right.sum + node.val;
            maxSum = Math.max(maxSum, sum);
            return new NodeInfo(true, Math.min(node.val, left.min), Math.max(node.val, right.max), sum);
        }
        return new NodeInfo(false, 0, 0, 0);
    }
}

public class MaximumSumBST {
    public static void main(String[] args) {
        /*
                1
               / \
              4   3
             / \    \
            2   4    5
                      \
                       6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);

        Solution sol = new Solution();
        System.out.println("Maximum Sum BST in Binary Tree = " + sol.maxSumBST(root));
    }
}
