package com.dsa.queues;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Gaurav Sachdeva
 * Date: 30/08/25
 */
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        //Insertion
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(20);

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("Deque: " + dq);

        System.out.println("Front: " + dq.peekFirst());
        System.out.println("Rear: " + dq.peekLast());

        // Size and empty
        System.out.println("Size: " + dq.size());
        System.out.println("Empty? " + dq.isEmpty());

    }
}