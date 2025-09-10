package com.dsa.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Gaurav Sachdeva
 * Date: 06/09/25
 */
public class TreeBoundaryTraversal {

    public List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        if (!isLeaf(root)) result.add(root.val);

        // 1. Left boundary
        addLeftBoundary(root.left, result);

        // 2. Leaf nodes
        addLeaves(root, result);

        // 3. Right boundary
        addRightBoundary(root.right, result);

        return result;
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    private void addLeftBoundary(TreeNode node, List<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.val);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }

    private void addRightBoundary(TreeNode node, List<Integer> res) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) stack.push(node.val);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        // reverse order
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }

    private void addLeaves(TreeNode node, List<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) {
            res.add(node.val);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
    
    public static void main(String[] args) {
        /*
              20
             /  \
           8     22
          / \      \
         4  12      25
            / \
           10 14
        */

            TreeNode root = new TreeNode(20);
            root.left = new TreeNode(8);
            root.right = new TreeNode(22);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(12);
            root.left.right.left = new TreeNode(10);
            root.left.right.right = new TreeNode(14);
            root.right.right = new TreeNode(25);

            TreeBoundaryTraversal sol = new TreeBoundaryTraversal();
            List<Integer> boundary = sol.boundaryTraversal(root);

            System.out.println("Boundary Traversal of Tree:");
            for (int val : boundary) {
                System.out.print(val + " ");
            }
        }
    }
