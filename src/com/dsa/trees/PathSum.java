package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 05/09/25
 */
public class PathSum {
    public static void main(String[] args) {
        int sum = 21;

        // Constructed binary tree is
        //         10
        //       /    \
        //      8      2
        //     / \    /
        //    3   5  2

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        System.out.println(hasPathSum(root, sum));
    }
    public static boolean hasPathSum(Node root,int sum){
        if(root == null){
            return false;
        }
        int subsum = sum - root.data;

        if(subsum == 0 && root.left ==null && root.right== null){
            return true;
        }
        boolean left = false, right = false;
        if(root.right!=null){
            right = hasPathSum(root.right,subsum);
        }
        if(root.left!=null){
            left = hasPathSum(root.left,subsum);
        }
        return left || right;
    }
}