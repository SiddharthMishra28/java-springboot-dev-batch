package com.java.primer;

abstract public class Animal {
    // A common attribute for all animals
    String name;
    // A constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }
    // An abstract method for all animals
    public abstract void makeSound();
    // A common method for all animals
    public void eat() {
        System.out.println(name + " is eating");
    }
}
