package com.java.functional;

import java.util.List;

public class PrintAllStringValuesFunctional {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "hi", "wassup", "hey", "ola");
        stringList.forEach(PrintAllStringValuesFunctional::printValueWithLength); // method reference
    }

    private static void printValueWithLength(String s){
        System.out.println(s+s.length());
    }
}
