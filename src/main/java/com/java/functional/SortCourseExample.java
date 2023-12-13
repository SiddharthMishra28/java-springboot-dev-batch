package com.java.functional;

import java.util.Comparator;
import java.util.List;

public class SortCourseExample {
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

        Comparator<Course> comparingByNumberOfStudentsAscending = Comparator.comparing(Course::getNumOfStudents);
        Comparator<Course> comparingByNumberOfStudentsDescending = Comparator.comparing(Course::getNumOfStudents).reversed();

        List<Course> sortedCoursesWithNumStudentsAscending = courses.stream().sorted(comparingByNumberOfStudentsAscending).toList();
        System.out.println(sortedCoursesWithNumStudentsAscending); // prints courses with number of students in ascending order

        List<Course> sortedCoursesWithNumStudentsDescending = courses.stream().sorted(comparingByNumberOfStudentsDescending).toList();
        System.out.println(sortedCoursesWithNumStudentsDescending); // prints course with number of students in descending order
    }
}
