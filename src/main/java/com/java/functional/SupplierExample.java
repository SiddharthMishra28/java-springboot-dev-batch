package com.java.functional;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
        System.out.println(randomIntSupplier.get());
    }
}
