package com.java.maps;

import java.util.EnumMap;
import java.util.Map;

/**
 * EnumMap: A map that uses an enum type as the key. It is more efficient and compact than a regular map.
 */
public class EnumMapExample {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        Map<Color, String> map = new EnumMap<>(Color.class);
        map.put(Color.RED, "red");
        map.put(Color.GREEN, "green");
        map.put(Color.BLUE, "blue");
        System.out.println(map); // {RED=red, GREEN=green, BLUE=blue}
        map.remove(Color.GREEN);
        System.out.println(map); // {RED=red, BLUE=blue}
    }
}
