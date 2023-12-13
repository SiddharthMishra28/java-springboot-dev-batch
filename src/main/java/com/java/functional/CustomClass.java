package com.java.functional;

import java.util.List;
import java.util.function.Predicate;

public class CustomClass {
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

        Predicate<Course> reviewCourseGreaterThan90 = c -> c.getReviewScore() > 90;
        Predicate<Course> reviewCourseGreaterThan95 = c -> c.getReviewScore() > 95;
        Predicate<Course> reviewCourseLessThan90 = c -> c.getReviewScore() < 90;
        // allMatch
        System.out.println(courses.stream().allMatch(reviewCourseGreaterThan90)); // true
        //noneMatch
        System.out.println(courses.stream().noneMatch(reviewCourseLessThan90)); // true
        System.out.println(courses.stream().noneMatch(reviewCourseGreaterThan95)); // false
        //anyMatch
        System.out.println(courses.stream().anyMatch(reviewCourseGreaterThan90)); // true
        System.out.println(courses.stream().anyMatch(reviewCourseLessThan90)); // false
    }
}
