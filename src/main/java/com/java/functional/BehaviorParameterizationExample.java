package com.java.functional;

import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationExample {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(12, 3, 4, 65, 7, 4, 21, 23, 12, 6);
        Predicate<Integer> filterPredicate = null;
        filterPredicate = i -> i % 2 == 0;
        filterBehavior(integerList, filterPredicate);
        filterPredicate = i -> i % 2 != 0;
        filterBehavior(integerList, filterPredicate);
    }

    // CAN BE TRANSITIONED TO BELOW BEHAVIOR PARAMETERIZED WAY
    private static void filterBehavior(List<Integer> integerList, Predicate<Integer> filterPredicate) {
        integerList.stream().filter(filterPredicate).forEach(System.out::println);
    }
}
