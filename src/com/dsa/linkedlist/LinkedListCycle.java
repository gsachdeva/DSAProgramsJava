package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 17/08/25
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // create cycle: 40 -> 20
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head)); // true
    }

    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
