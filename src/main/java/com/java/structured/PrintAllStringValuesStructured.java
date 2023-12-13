package com.java.structured;

import java.util.List;

public class PrintAllStringValuesStructured {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "hi", "wassup", "hey", "ola");
        for(String s : stringList){
            System.out.println(s);
        }
    }
}
