package service;

import model.*;
import exception.*;

public class RegistrationManager {

    public void register(Student student, Course course) throws RegistrationException {

        if (student.getCourses().contains(course)) {
            throw new RegistrationException("Already registered for this course!");
        }

        student.addCourse(course);
        System.out.println("Course registered successfully!");
    }
}