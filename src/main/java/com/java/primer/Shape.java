package com.java.primer;

public class Shape {
    // A common attribute for all shapes
    String color;
    // A constructor to initialize the color
    public Shape(String color) {
        this.color = color;
    }
    // A common method for all shapes
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
