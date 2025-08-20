package com.dsa.linkedlist;

import java.util.List;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/08/25
 */
public class MergeSortedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2= l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null){
            curr.next = l1;
        }
        else{
            curr.next = l2;
        }
        return dummy.next;
    }

    // Utility: print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        // Create first sorted list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create second sorted list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println("List 1:");
        printList(list1);
        System.out.println("List 2:");
        printList(list2);

        // Merge
        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(merged);
    }
}