package com.java.structured;

import java.util.*;

public class SortedMethodStructured {
    public static void main(String[] args) {
        List<String> orderedItems = List.of("Shirt", "Watch", "Sunglasses", "Coffee Mug", "Airpod", "Iphone");
        Set<String> sortedOrderItems = new TreeSet<>(orderedItems);
        for(String s : sortedOrderItems){
            System.out.println(s);
        }
    }
}
