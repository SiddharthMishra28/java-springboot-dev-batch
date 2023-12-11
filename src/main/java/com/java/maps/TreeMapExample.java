package com.java.maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap: A map that maintains the ascending order of the keys.
 * It implements the SortedMap interface and does not allow null keys or values.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map); // {1=one, 2=two, 3=three}
        map.remove(2);
        System.out.println(map); // {1=one, 3=three}
    }
}
