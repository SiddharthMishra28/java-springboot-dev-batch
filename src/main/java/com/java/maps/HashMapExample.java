package com.java.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap: A map that does not maintain any order and allows null keys and values.
 * It offers constant-time performance for basic operations.
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map); // {1=one, 2=two, 3=three}
        map.remove(2);
        System.out.println(map); // {1=one, 3=three}
    }
}
