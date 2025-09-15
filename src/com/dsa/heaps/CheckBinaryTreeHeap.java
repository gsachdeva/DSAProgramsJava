package com.dsa.heaps;

/**
 * Author: Gaurav Sachdeva
 * Date: 14/09/25
 */
import java.util.LinkedList;
import java.util.Queue;

public class CheckBinaryTreeHeap {

    // 1. Check if tree is Complete using BFS
    private static boolean isComplete(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean foundNull = false;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                foundNull = true;
            } else {
                if (foundNull) return false; // non-null after null → not complete
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return true;
    }

    // 2. Check Heap property (Max Heap)
    private static boolean isHeapProperty(TreeNode root) {
        if (root == null) return true;

        // Leaf node
        if (root.left == null && root.right == null) return true;

        // Only left child
        if (root.right == null) {
            return root.val >= root.left.val && isHeapProperty(root.left);
        }

        // Both children
        return root.val >= root.left.val &&
                root.val >= root.right.val &&
                isHeapProperty(root.left) &&
                isHeapProperty(root.right);
    }

    // Main check
    public static boolean isHeap(TreeNode root) {
        return isComplete(root) && isHeapProperty(root);
    }

    public static void main(String[] args) {
        /* Example Tree (Max Heap)
                 10
                /  \
               9    8
              / \  /
             7  6 5
        */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);

        System.out.println("Is tree a heap? " + isHeap(root));
    }
}
