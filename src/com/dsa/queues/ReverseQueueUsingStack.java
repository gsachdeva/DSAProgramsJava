package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static com.dsa.queues.ReverseQueueUsingRecursion.printQueue;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class ReverseQueueUsingStack {
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

        reverseQueueUsingStack(q);
        printQueue(q);
    }
    public static void reverseQueueUsingStack(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            int element = q.poll();
            s.push(element);
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}