package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 13/08/25
 */

public class DeleteFirstNode {
    public static Node deleteValue(Node head){

        //First we need to check where head is null or not
        if(head == null){
            return null;
        }
        // Store the current head in a temporary variable
        Node temp = head;

        head=head.next;
        temp = null;

        return head;
    }

    // This function prints the contents of
    // the linked list starting from the head
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);


        head=deleteValue(head);
        System.out.print("\nAfter inserting 1 at the end:");
        printList(head);
    }
}