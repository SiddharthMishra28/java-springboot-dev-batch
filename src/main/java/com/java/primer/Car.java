package com.java.primer;

public class Car extends Vehicle{
    // A specific attribute for cars
    String model;
    // A constructor to initialize the speed and model
    public Car(int speed, String model) {
        // Calling the superclass constructor
        super(speed);
        this.model = model;
    }
    // A specific method for cars
    public void honk() {
        System.out.println("Car is honking");
    }
    // Overriding the move method from Vehicle
    @Override
    public void move() {
        System.out.println("Car of model " + model + " is moving at " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Creating an object of Vehicle class
        Vehicle vehicle = new Vehicle(60);
        // Calling the common method
        vehicle.move(); // Vehicle is moving at 60 km/h

        // Creating an object of Car class
        Car car = new Car(80, "Tesla");
        // Calling the inherited method
        car.move(); // Car of model Tesla is moving at 80 km/h
        // Calling the specific method
        car.honk(); // Car is honking
    }
}
