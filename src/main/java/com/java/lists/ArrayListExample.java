package com.java.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits); // [Apple, Banana, Orange]
        fruits.remove(1);
        System.out.println(fruits); // [Apple, Orange]
    }
}
