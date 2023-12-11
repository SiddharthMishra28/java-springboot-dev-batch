package com.java.sets;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet: An ordered set that maintains the insertion order of the elements.
 * It inherits from HashSet and offers the same performance but with predictable iteration order.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println(set); // [one, two, three]
        set.remove("two");
        System.out.println(set); // [one, three]
    }
}
