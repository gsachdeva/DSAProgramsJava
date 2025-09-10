package com.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/09/25
 */
public class LevelOrderTraversal {

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }

        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node front = queue.poll();
            if(front == null){
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null); // marker for next level
                }
            }else{
                System.out.print(front.data + " ");
                if (front.left != null) queue.add(front.left);
                if (front.right != null) queue.add(front.right);
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal (line by line):");
        levelOrderTraversal(root);
    }
}