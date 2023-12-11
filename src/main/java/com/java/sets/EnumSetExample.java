package com.java.sets;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {

    enum Color {
        RED, GREEN, BLUE
    }
    public static void main(String[] args) {
        Set<Color> set = EnumSet.of(Color.RED, Color.GREEN);
        System.out.println(set); // [RED, GREEN]
        set.add(Color.BLUE);
        System.out.println(set); // [RED, GREEN, BLUE]
    }
}
