package com.java.functional;

import java.util.List;

public class ScoresExampleFunctional {
    public static void main(String[] args) {
        List<Integer> numScores = List.of(12,16,23,31,13,19,18,17,22,17);
        numScores.stream().map(c -> c+2).forEach(System.out::println);
    }
}
