package com.java.structured;

import java.util.ArrayList;
import java.util.List;

public class MapExampleStructured {
    public static void main(String[] args) {
        List<Double> fundValues = List.of(450.0, 230.0, 430.0, 300.0, 750.0, 600.0);
        List<Double> projectedValues = new ArrayList<>();
        for(Double d : fundValues){
            projectedValues.add(d+(0.15*d));
        }
        System.out.println(projectedValues);
    }
}
