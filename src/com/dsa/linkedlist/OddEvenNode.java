package com.dsa.linkedlist;
/**
 * Author: Gaurav Sachdeva
 * Date: 19/08/25
 */

public class OddEvenNode{
    public ListNode oddEvenByValue(ListNode head) {
        if (head == null) return null;

        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode odd = oddDummy, even = evenDummy;

        ListNode current = head;
        while (current != null) {
            if ((current.val & 1) == 1) {  // odd value
                odd.next = current;
                odd = odd.next;
            } else {  // even value
                even.next = current;
                even = even.next;
            }
            current = current.next;
        }

        even.next = null;       // important: avoid cycle
        odd.next = evenDummy.next; // connect odd list with even list
        return oddDummy.next;
    }

    public static void main(String[] args) {
        // Example: 1->4->3->2->5->6
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        OddEvenNode solution = new OddEvenNode();
        ListNode result = solution.oddEvenByValue(head);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}