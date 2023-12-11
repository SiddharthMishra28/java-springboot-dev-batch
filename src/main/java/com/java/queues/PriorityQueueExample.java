package com.java.queues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue: A heap-based priority queue that implements the Queue interface.
 * It orders the elements according to their natural order or a specified comparator.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue); // [one, three, two]
        queue.poll();
        System.out.println(queue); // [three, two]
    }
}
