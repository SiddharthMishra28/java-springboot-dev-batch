package com.java.lists;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers); // [1, 2, 3]
        numbers.set(0, 10);
        System.out.println(numbers); // [10, 2, 3]
    }
}
