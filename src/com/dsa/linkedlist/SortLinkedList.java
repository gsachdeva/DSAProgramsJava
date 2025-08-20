package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/08/25
 */
public class SortLinkedList {
    public static Node sortList(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMiddle(head);
        Node rightHead= mid.next;

        mid.next=null;

        Node left= sortList(head);
        Node right= sortList(rightHead);
        return merge(left,right);
    }
    public static Node merge(Node left,Node right){
        Node dummy = new Node(0);
        Node curr = dummy;

        while(right!=null && left!=null){
            if(left.data < right.data){
                curr.next= left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr= curr.next;
        }
        if (left != null) curr.next = left;
        if (right != null) curr.next = right;

        return dummy.next;
    }
    private static Node getMiddle(Node head){
        Node slow= head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Utility to print list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SortLinkedList sorter = new SortLinkedList();
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original List:");
        sorter.printList(head);

        head = sorter.sortList(head);

        System.out.println("Sorted List:");
        sorter.printList(head);
    }
}