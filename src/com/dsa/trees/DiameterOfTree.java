package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/09/25
 */

class TreeInfo {
    int height;
    int diameter;

    TreeInfo(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}

public class DiameterOfTree {

    // Function to calculate diameter
    public static TreeInfo diameter(Node root){
        if (root == null) {
            return new TreeInfo(0, 0); // height=0, diameter=0
        }

        // Get info for left and right subtrees
        TreeInfo leftInfo = diameter(root.left);
        TreeInfo rightInfo = diameter(root.right);

        // Current height
        int currHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        // Diameter can be either:
        // 1. In left subtree
        // 2. In right subtree
        // 3. Passing through root (left height + right height + 1)
        int currDiameter = Math.max(
                leftInfo.height + rightInfo.height + 1,
                Math.max(leftInfo.diameter, rightInfo.diameter)
        );

        return new TreeInfo(currHeight, currDiameter);
    }


    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        //        \
        //         6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        TreeInfo result = diameter(root);
        System.out.println("Height of tree: " + result.height);
        System.out.println("Diameter of tree: " + result.diameter);
    }
}