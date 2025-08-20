package com.dsa.linkedlist;

/**
 * Author: Gaurav Sachdeva
 * Date: 19/08/25
 */
public class DetectCycle {

    public static boolean hasCycle(ListNode head){
        if(head == null && head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public class Main {
        public static void main(String[] args) {
            // Create nodes
            ListNode head = new ListNode(3);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(0);
            ListNode node4 = new ListNode(-4);

            // Build list with cycle: 3 -> 2 -> 0 -> -4 -> (back to 2)
            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2; // cycle here

            DetectCycle sol = new DetectCycle();
            boolean cycleNode = sol.hasCycle(head);

            if (!cycleNode) {
                System.out.println("Cycle starts at node with value: " + true);
            } else {
                System.out.println("No cycle detected.");
            }
        }
    }
}