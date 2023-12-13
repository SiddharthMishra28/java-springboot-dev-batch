package com.java.structured;

import java.util.List;

public class ScoresExampleStructured {
    public static void main(String[] args) {
        List<Integer> numScores = List.of(12,16,23,31,13,19,18,17,22,17);
        for(int i : numScores){
            System.out.println(i+2);
        }
    }
}
