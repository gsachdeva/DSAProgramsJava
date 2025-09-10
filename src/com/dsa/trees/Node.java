package com.dsa.trees;

/**
 * Author: Gaurav Sachdeva
 * Date: 04/09/25
 */
public class Node {
    // Node structure
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
}