package com.java.primer;

public class Bird extends Animal implements Flyable{
    // A constructor to initialize the name
    public Bird(String name) {
        // Calling the superclass constructor
        super(name);
    }
    // Implementing the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
    // Implementing the abstract method from Flyable
    @Override
    public void fly() {
        System.out.println(name + " is flying up to " + MAX_HEIGHT + " meters");
    }

    public static void main(String[] args) {
        // Creating an object of Cat class
        Cat cat = new Cat("Kitty");
        // Calling the inherited method
        cat.makeSound(); // Meow meow
        // Calling the common method
        cat.eat(); // Kitty is eating

        // Creating an object of Bird class
        Bird bird = new Bird("Tweety");
        // Calling the inherited method
        bird.makeSound(); // Chirp chirp
        // Calling the common method
        bird.eat(); // Tweety is eating
        // Calling the implemented method
        bird.fly(); // Tweety is flying up to 1000 meters
    }
}
