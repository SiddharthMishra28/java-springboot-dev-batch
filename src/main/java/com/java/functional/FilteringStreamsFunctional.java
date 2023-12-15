package com.java.functional;

import java.util.List;

public class FilteringStreamsFunctional {
    public static void main(String[] args) {
        List<Integer> numScores = List.of(72,54,81,87,77,80,96,92,33,54);
        numScores.stream().
                 filter(score -> score>=80) // score >= 80 - Lambda Expression
                .forEach(System.out::println);
    }
}
