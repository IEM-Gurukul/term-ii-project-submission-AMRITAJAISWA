package model;

import java.util.*;

public class Student {
    private String name;
    private List<Course> registeredCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        registeredCourses.add(course);
    }

    public List<Course> getCourses() {
        return registeredCourses;
    }

    public String getName() {
        return name;
    }

    public void displayCourses() {
        System.out.println("\nRegistered Courses:");
        for (Course c : registeredCourses) {
            c.displayDetails("  ");
        }
    }
}