package com.java.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap: A map that is designed for concurrency.
 * It allows concurrent read and write operations and does not block threads. It does not allow null keys or values2.
 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map); // {1=one, 2=two, 3=three}
        map.remove(2);
        System.out.println(map); // {1=one, 3=three}
    }
}
