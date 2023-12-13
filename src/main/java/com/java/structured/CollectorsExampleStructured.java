package com.java.structured;

import java.util.ArrayList;
import java.util.List;

public class CollectorsExampleStructured {
    public static void main(String[] args) {
        List<Double> userAmountsInvested = List.of(4500.0, 2300.0, 3555.0, 6000.0);
        List<Double> userProfitAmounts = new ArrayList<>();
        for(double d : userAmountsInvested){
            userProfitAmounts.add(d+(0.15*d));
        }
        for(double d: userProfitAmounts){
            System.out.println(d);
        }
    }
}
