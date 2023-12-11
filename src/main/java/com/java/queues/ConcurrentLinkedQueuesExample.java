package com.java.queues;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * ConcurrentLinkedQueue: A concurrent version of a queue that supports concurrent insertion and
 * removal of elements without locking.
 */
public class ConcurrentLinkedQueuesExample {
    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue); // [one, two, three]
        queue.poll();
        System.out.println(queue); // [two, three]
    }
}
