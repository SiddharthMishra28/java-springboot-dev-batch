package com.java.structured;

import java.util.List;

public class FilteringStreamsStructured {
    public static void main(String[] args) {
        List<Integer> numScores = List.of(72,54,81,87,77,80,96,92,33,54);
        for(int num : numScores){
            if(num >= 80){
                System.out.println(num);
            }
        }
    }
}
