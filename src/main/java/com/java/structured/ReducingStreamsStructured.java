package com.java.structured;

import java.util.List;

public class ReducingStreamsStructured {
    public static void main(String[] args) {
        List<Double> moneyInvested = List.of(200.45, 350.5, 450.0, 340.90, 110.50);
        Double netAmount = 0.0;
        for(double amt: moneyInvested){
            netAmount+=amt+(amt*0.08);
        }
        System.out.println(netAmount);
    }
}
