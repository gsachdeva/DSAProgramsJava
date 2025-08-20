package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 16/08/25
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Is Palindrome? " + isPalindrome(head));
    }

    public static boolean isPalindrome(Node head) {
        if (head == null)
            return false;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseLinkedList(slow.next);
        Node firstHalf = head;
        Node temp = secondHalf;
        boolean palindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        slow.next = reverseLinkedList(temp);

        return palindrome;
    }
    public static Node reverseLinkedList(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node forward = curr.next;
            curr.next= prev;
            prev= curr;
            curr = forward;
        }
        return prev;
    }

}