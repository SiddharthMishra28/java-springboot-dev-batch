package com.java.sets;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * ConcurrentSkipListSet: A concurrent version of a sorted set that supports concurrent access,
 * insertion, and removal of elements.
 */
public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new ConcurrentSkipListSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set); // [1, 2, 3]
        set.remove(2);
        System.out.println(set); // [1, 3]
    }
}
