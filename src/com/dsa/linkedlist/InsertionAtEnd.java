package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 12/08/25
 */
public class InsertionAtEnd {
    public static Node insertAtEnd(Node head, int newData){
        // Create a new node
        Node newNode = new Node(newData);
        //First we need to check where head is null or not
        if(head == null){
            return newNode;
        }
        // Store the head reference in a temporary variable
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        // Change the next pointer of the
        // last node to point to the new node
        last.next = newNode;

        // Return the head of the list
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

        // Example of appending a node at the end
        head = insertAtEnd(head, 1);

        System.out.print("\nAfter inserting 1 at the end:");
        printList(head);
    }
}