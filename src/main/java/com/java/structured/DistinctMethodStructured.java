package com.java.structured;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctMethodStructured {
    public static void main(String[] args) {
        List<String> productList = List.of("Phone", "Laptop", "Smart-watch",
                "Laptop", "Smart-watch", "Powerbank", "Laptop", "Phone");
        Set<String> products = new HashSet<>(productList);
        for(String p : products){
            System.out.println(p);
        }
    }
}
