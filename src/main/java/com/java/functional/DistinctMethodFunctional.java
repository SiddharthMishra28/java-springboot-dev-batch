package com.java.functional;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethodFunctional {
    public static void main(String[] args) {
        List<String> productList = List.of("Phone", "Laptop", "Smart-watch",
                "Laptop", "Smart-watch", "Powerbank", "Laptop", "Phone");
        productList.stream().distinct().forEach(System.out::println);
    }
}
