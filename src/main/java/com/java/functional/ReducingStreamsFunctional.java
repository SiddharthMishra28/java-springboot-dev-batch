package com.java.functional;

import java.util.List;

public class ReducingStreamsFunctional {
    public static void main(String[] args) {
        List<Double> moneyInvested = List.of(200.45, 350.5, 450.0, 340.90, 110.50);
        Double netAmount = moneyInvested.stream().map(val -> val+(0.08*val)).reduce(0.0, (x,y)->x+y);
        System.out.println(netAmount);
    }
}
