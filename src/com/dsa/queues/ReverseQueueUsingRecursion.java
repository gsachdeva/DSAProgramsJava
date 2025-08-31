package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class ReverseQueueUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(27);
        q.add(30);
        q.add(45);
        q.add(85);
        q.add(92);
        q.add(58);
        q.add(80);
        q.add(90);
        q.add(100);

        reverseQueue(q);
        printQueue(q);

    }
    public static void reverseQueue(Queue<Integer> queue){
        //Base Case
        if(queue.isEmpty()){
            return;
        }
        int element = queue.poll();
        reverseQueue(queue);

        queue.add(element);
    }
    static void printQueue(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

}