package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 15/08/25
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
       // reverseLinkedList(head);
        Node prev= null;
        head = recursionReverseLinkedList(head,prev);
        printList(head);
    }
    public static void reverseLinkedList(Node head){
        if(head== null){
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
           Node forward = curr.next;
           curr.next= prev;
           prev= curr;
           curr = forward;
       }
        head = prev;
        printList(head);
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
    public static Node recursionReverseLinkedList(Node curr,Node prev){
        if(curr== null){
            return prev;
        }
        Node forward = curr.next;
        curr.next = prev;

        return recursionReverseLinkedList(forward,curr);
    }
}