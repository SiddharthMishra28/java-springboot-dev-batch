package com.java.primer;

public class Circle extends Shape{
    // A specific attribute for circles
    double radius;
    // A constructor to initialize the color and radius
    public Circle(String color, double radius) {
        // Calling the superclass constructor
        super(color);
        this.radius = radius;
    }
    // A specific method for circles
    public void calculateArea() {
        System.out.println("The area of the circle is " + Math.PI * radius * radius);
    }
    // Overriding the draw method from Shape
    @Override
    public void draw() {
        System.out.println("Drawing a circle of color " + color + " and radius " + radius);
    }

// A main class to test the inheritance
    public static void main(String[] args) {
        // Creating an object of Shape class
        Shape shape = new Shape("red");
        // Calling the common method
        shape.draw(); // Drawing a shape

        // Creating an object of Circle class
        Circle circle = new Circle("blue", 5.0);
        // Calling the inherited method
        circle.draw(); // Drawing a circle of color blue and radius 5.0
        // Calling the specific method
        circle.calculateArea(); // The area of the circle is 78.53981633974483
    }
}
