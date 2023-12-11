package com.java.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap: A map that maintains the insertion order of the entries.
 * It inherits from HashMap and allows null keys and values.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map); // {1=one, 2=two, 3=three}
        map.remove(2);
        System.out.println(map); // {1=one, 3=three}
    }
}
