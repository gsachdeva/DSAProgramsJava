package com.dsa.trees;

import java.util.List;

/**
 * Author: Gaurav Sachdeva
 * Date: 06/09/25
 */
public class RightTreeView {
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

        LeftTreeView sol = new LeftTreeView();
        List<Integer> leftView = sol.leftView(root);

        System.out.println("Left View of Tree:");
        for (int val : leftView) {
            System.out.print(val + " ");
        }
    }
}