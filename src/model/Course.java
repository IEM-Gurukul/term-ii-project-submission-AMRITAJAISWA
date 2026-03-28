package model;

import java.util.*;

public class Course extends CourseComponent {

    private List<CourseComponent> components = new ArrayList<>();

    public Course(String name) {
        super(name);
    }

    public void addComponent(CourseComponent component) {
        components.add(component);
    }

    public void removeComponent(CourseComponent component) {
        components.remove(component);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Course: " + name);
        for (CourseComponent c : components) {
            c.displayDetails(indent + "  ");
        }
    }

    @Override
    public int getCredits() {
        int total = 0;
        for (CourseComponent c : components) {
            total += c.getCredits();
        }
        return total;
    }
}