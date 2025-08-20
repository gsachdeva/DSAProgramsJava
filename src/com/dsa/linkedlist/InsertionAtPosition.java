package com.dsa.linkedlist;// Java program for insertion in a single linked
// list at a specified position

class InsertionAtPosition {

    // function to insert a Node at required position
    static Node insertPos(Node head, int pos, int data) {

        // This condition to check whether the
        // position given is valid or not.
        if (pos < 1)
            return head;

        // head will change if pos=1
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        // Traverse to the node that will be
        // present just before the new node
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // if position is greater than number of elements
        if (curr == null)
            return head;

        Node newNode = new Node(data);

        // update the next pointers
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
            int[] values = {3, 5, 8, 10};
            Node head = null;
            Node tail = null;

            for (int val : values) {
                Node newNode = new Node(val);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            int data = 12, pos = 3;
            head = insertPos(head, pos, data);
            printList(head);
        }
}