package com.java.functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumerExample {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(12,3,4,65,7,4,21,23,12,6);
        integerList.stream().distinct().filter(i -> i%2==0).map(i->i*i).forEach(System.out::println);
    }

//    private static Predicate<Integer> getIntegerPredicate() {
//        return i -> i % 2 == 0;
//    }

//    private static Function<Integer, Integer> getIntegerIntegerFunction() {
//        return i -> i * i;
//    }

//    private static Consumer<Integer> getConsumer() {
//        return System.out::println;
//    }
}
