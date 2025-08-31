package com.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Gaurav Sachdeva
 * Date: 31/08/25
 */
public class InterleaveHalvesOfQueue {

    public static Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> first_half= new LinkedList<>();
        Queue<Integer> second_half= new LinkedList<>();
        Queue<Integer> result= new LinkedList<>();

        for(int i = 0;i< n/2;i++){
            first_half.add(q.poll());
        }
        while (!q.isEmpty()) {
            second_half.add(q.poll());
        }
        while (!first_half.isEmpty() && !second_half.isEmpty()) {
            result.add(first_half.poll());
            result.add(second_half.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
        Queue<Integer> result = rearrangeQueue(q);
        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}