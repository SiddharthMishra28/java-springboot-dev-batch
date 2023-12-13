package com.java.functional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaxMinFindFirstExample {
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

        Comparator<Course> compareByReviewScoreAndNumStudents =
                Comparator.comparing(Course::getReviewScore).thenComparing(Course::getNumOfStudents);

        // max
        System.out.println(courses.stream().max(compareByReviewScoreAndNumStudents).get()); // fetches the course with maximum review score and then maximum students enrolled

        // min
        System.out.println(courses.stream().min(compareByReviewScoreAndNumStudents).get()); // fetches the course with minimum review score and then with students enrolled

        // findFirst
        Predicate<Course> filterByCategory = c -> c.getCategory().equals("Cloud");
        System.out.println(courses.stream().filter(filterByCategory).findFirst()); // will filter out the first result matching the category of Cloud
    }
}
