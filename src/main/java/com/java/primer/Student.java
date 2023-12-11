package com.java.primer;

public class Student {
    // A private attribute for the student's name
    private String name;
    // A public constructor to initialize the name
    public Student(String name) {
        this.name = name;
    }
    // A public getter method to get the name
    public String getName() {
        return name;
    }
    // A public setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating an object of Student class
        Student student = new Student("Alice");
        // Accessing the name through the getter method
        System.out.println("The student's name is " + student.getName()); // The student's name is Alice
        // Modifying the name through the setter method
        student.setName("Bob");
        // Accessing the name through the getter method
        System.out.println("The student's name is " + student.getName()); // The student's name is Bob
    }
}
