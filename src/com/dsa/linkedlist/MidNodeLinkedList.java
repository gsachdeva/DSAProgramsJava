package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/08/25
 */
public class MidNodeLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(8);

        Node mid = findMiddle(head);
        System.out.println("Middle Node: " + mid.data);
    }

    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
        }

        return slow; // slow is middle
    }
}
