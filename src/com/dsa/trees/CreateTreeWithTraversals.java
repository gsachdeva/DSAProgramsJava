package com.dsa.trees;

import java.util.Scanner;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/09/25
 */
public class CreateTreeWithTraversals {
    Node root;

    public CreateTreeWithTraversals() {
        root = null; // Initialize an empty tree
    }

    // Method to insert a new node into the tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }


    public static void main(String[] args) {

        CreateTreeWithTraversals tree = new CreateTreeWithTraversals();

        // Insert elements into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the binary tree:");
        inorder(tree.root);

        System.out.println("Preorder traversal of the binary tree:");
        preorder(tree.root);

        System.out.println("Postorder traversal of the binary tree:");
        postorder(tree.root);

    }

    private Node insertRecursive(Node current, int data){
        if (current == null) {
            return new Node(data); // Create a new node if the current position is empty
        }

        // Decide whether to go left or right based on the data
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // Value already exists, handle as needed (e.g., do nothing, update)
            return current;
        }
        return current;

    }
    // Inorder Traversal (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal (Root → Left → Right)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal (Left → Right → Root)
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}