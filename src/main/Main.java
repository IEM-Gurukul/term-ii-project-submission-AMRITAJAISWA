package main;

import java.util.Scanner;
import model.*;
import service.*;
import util.*;
import exception.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RegistrationManager manager = new RegistrationManager();

        Student student = new Student("Amrita");

        // Sample course
        Course javaCourse = new Course("Java Course");
        javaCourse.addComponent(new model.Module("Java Basics", 3));
        javaCourse.addComponent(new model.Module("OOP Concepts", 4));
        javaCourse.addComponent(new model.SubModule("Advanced Topics", 2));

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Register Course");
            System.out.println("2. View Courses");
            System.out.println("3. Save to File");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        manager.register(student, javaCourse);
                        break;

                    case 2:
                        student.displayCourses();
                        break;

                    case 3:
                        FileHandler.saveToFile(student);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (RegistrationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
