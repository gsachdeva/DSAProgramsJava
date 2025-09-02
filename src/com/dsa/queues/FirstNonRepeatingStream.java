package com.dsa.queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Author: Gaurav Sachdeva
 * Date: 02/09/25
 */
public class FirstNonRepeatingStream {
    public static void main(String[] args) {
        String stream = "aabc";
        firstNonRepeating(stream);
    }
    static void firstNonRepeating(String stream){
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char ch : stream.toCharArray()){
            // increase frequency
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // push into queue
            q.add(ch);

            // remove all repeating chars from front
            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }
            // print result
            if (q.isEmpty()) {
                System.out.print("# ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }
    }
}