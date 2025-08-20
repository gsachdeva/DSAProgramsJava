package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 12/08/25
 */
public class InsertionAtHeader {

    public static Node insertAtFront(Node head, int newData){
       //First we create a node to add data
        Node newNode = new Node(newData);
        // Make the next of the new node point to the current head
        newNode.next = head;
        head = newNode;
        // Return the new node as the new head of the list
        return head;
    }
    public static void printList(Node head){
        //To print the whole linked list, we need to run the loop..
        // Condition is if head is not null then we will continue
        Node current= head;
        while(current !=null){
            System.out.print(" "+ current.data);
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        System.out.println("After inserting Nodes at the front:");
        int data = 1;
        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}
