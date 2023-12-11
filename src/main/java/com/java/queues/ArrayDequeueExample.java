package com.java.queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ArrayDeque: A resizable array that implements the Deque and Queue interfaces.
 * It is fast for both random access and insertion and deletion at both ends.
 */
public class ArrayDequeueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        System.out.println(queue); // [one, two, three]
        queue.poll();
        System.out.println(queue); // [two, three]
    }
}
