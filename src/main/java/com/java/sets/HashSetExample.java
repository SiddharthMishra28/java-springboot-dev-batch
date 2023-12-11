package com.java.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet: An unordered set that uses a hash table to store the elements.
 * It offers constant-time performance for basic operations but does not guarantee any order of the elements.
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set); // [1, 2, 3]
        set.remove(2);
        System.out.println(set); // [1, 3]
    }
}
