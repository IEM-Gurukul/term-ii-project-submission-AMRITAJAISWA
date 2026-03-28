package util;

import java.io.*;
import model.*;

public class FileHandler {

    public static void saveToFile(Student student) {
        try {
            FileWriter writer = new FileWriter("registration.txt");

            writer.write("Student: " + student.getName() + "\n");

            for (Course c : student.getCourses()) {
                writer.write("Course: " + c.getName() + "\n");
                writer.write("Total Credits: " + c.getCredits() + "\n");
            }

            writer.close();
            System.out.println("Data saved to file!");

        } catch (IOException e) {
            System.out.println("Error saving file!");
        }
    }
}
