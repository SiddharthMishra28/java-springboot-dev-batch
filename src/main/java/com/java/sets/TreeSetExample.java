package com.java.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet: A sorted set that orders the elements according to their natural order or a specified comparator.
 * It implements the SortedSet interface and offers logarithmic-time performance for basic operations.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println(set); // [one, three, two]
        set.remove("one");
        System.out.println(set); // [three, two]
    }
}
