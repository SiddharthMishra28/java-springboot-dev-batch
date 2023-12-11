package com.java.primer;

public class Cat extends Animal{
    // A constructor to initialize the name
    public Cat(String name) {
        // Calling the superclass constructor
        super(name);
    }
    // Implementing the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
