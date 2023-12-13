package com.java.functional;

import java.util.List;
import java.util.stream.Collectors;

public class MapExampleFunctional {
    public static void main(String[] args) {
        List<Double> fundValues = List.of(450.0, 230.0, 430.0, 300.0, 750.0, 600.0);
        List<Double> projectedValues = fundValues.stream().map(v -> v+(0.15*v)).toList();
    }
}
