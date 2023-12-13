package com.java.primer;

public class Truck extends UtilityVehicle{
    String make;
    String model;

    public static void main(String[] args) {
        Truck t = new Truck();
        t.changeGear(5);
    }

    @Override
    public void changeGear(int gearNumber, int gas){

    }
}
