package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 05/09/25
 */
public class LowestCommonAncestor {
    public Node lowestCommonAncestor(Node root, Node p, Node q){

        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        // If both sides returned non-null → current root is LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return whichever side is non-null
        return (left != null) ? left : right;

    }



    public static void main(String[] args) {
        /*
                3
               / \
              5   1
             / \  / \
            6  2 0   8
              / \
             7   4
        */

        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        LowestCommonAncestor obj = new LowestCommonAncestor();

        // Test case 1
        Node lca1 = obj.lowestCommonAncestor(root, root.left, root.right);
        System.out.println("LCA(5, 1) = " + lca1.data); // Expected 3

        // Test case 2
        Node lca2 = obj.lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println("LCA(5, 4) = " + lca2.data); // Expected 5

        // Test case 3
        Node lca3 = obj.lowestCommonAncestor(root, root.left.right.left, root.left.right.right);
        System.out.println("LCA(7, 4) = " + lca3.data); // Expected 2
    }
}