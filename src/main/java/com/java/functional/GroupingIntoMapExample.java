package com.java.functional;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingIntoMapExample {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 98, 22000),
                new Course("API", "Microservices", 95, 18000),
                new Course("Microservices", "Microservices", 97, 14000),
                new Course("Fullstack", "Fullstack", 96, 16000),
                new Course("Aws", "Cloud", 94, 20000),
                new Course("Azure", "Cloud", 92, 18000),
                new Course("Kubernetes", "Cloud", 91, 22000)
        );

        //groupBy
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory))); // displays courses grouped by category

        // count number of courses in each category
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))); // {Cloud=3, Fullstack=1, Microservices=2, Framework=2}
    }
}
