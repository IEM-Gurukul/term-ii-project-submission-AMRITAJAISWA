package model;

public abstract class CourseComponent {
    protected String name;

    public CourseComponent(String name) {
        this.name = name;
    }

    public abstract void displayDetails(String indent);
    public abstract int getCredits();
}
