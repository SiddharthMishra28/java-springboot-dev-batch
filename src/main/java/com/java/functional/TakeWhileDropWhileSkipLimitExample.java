package com.java.functional;

import java.util.List;

public class TakeWhileDropWhileSkipLimitExample {
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

        //limit
        System.out.println(courses.stream().filter(c -> c.getReviewScore() > 95).limit(2).toList()); // displays top two courses with review score > 95

        // skip
        System.out.println(courses.stream().filter(c -> c.getReviewScore() > 95).skip(2).toList()); // displays the result after skipping the top two courses with review score > 95

        // takeWhile
        System.out.println(courses.stream().takeWhile(c -> c.getNumOfStudents() > 15000).toList()); // keeps on putting elements into the stream until number of students > 15000 condition is violated

        // dropWhile
        System.out.println(courses.stream().dropWhile(c -> c.getNumOfStudents() > 15000).toList()); // keeps on dropping elements into the stream until number of students > 15000 condition is violated

    }
}
