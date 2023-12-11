package com.java.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println(animals); // [Dog, Cat, Cow]
        animals.poll();
        System.out.println(animals); // [Cat, Cow]
    }
}
