package com.java.functional;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExampleFunctional {
    public static void main(String[] args) {
        List<Double> userAmountsInvested = List.of(4500.0, 2300.0, 3555.0, 6000.0);
        List<Double> userProfitAmounts = userAmountsInvested.stream().map(amt -> amt+(0.15*amt)).toList();
    }
}
