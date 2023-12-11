package com.java.primer;

public class Vehicle {
    // A common attribute for all vehicles
    int speed;
    // A constructor to initialize the speed
    public Vehicle(int speed) {
        this.speed = speed;
    }
    // A common method for all vehicles
    public void move() {
        System.out.println("Vehicle is moving at " + speed + " km/h");
    }
}
