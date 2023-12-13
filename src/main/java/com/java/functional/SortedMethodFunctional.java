package com.java.functional;

import java.util.Comparator;
import java.util.List;

public class SortedMethodFunctional {
    public static void main(String[] args) {
        List<String> orderedItems = List.of("Shirt", "Watch", "Sunglasses", "Coffee Mug", "Airpod", "Iphone");
        orderedItems.stream().sorted().forEach(System.out::println);
    }
}
