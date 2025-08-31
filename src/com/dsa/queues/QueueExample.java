package com.dsa.queues;

/**
 * Author: Gaurav Sachdeva
 * Date: 30/08/25
 */
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);  // can also use offer(10)
        queue.add(20);
        queue.add(30);

        System.out.println("Front element: " + queue.peek()); // 10

        // Dequeue
        int removed = queue.remove(); // can also use poll()
        System.out.println("Removed element: " + removed);

        System.out.println("Front after dequeue: " + queue.peek()); // 20

        // Check if empty
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }

        // Display full queue
        System.out.println("Queue elements: " + queue);
    }
}
