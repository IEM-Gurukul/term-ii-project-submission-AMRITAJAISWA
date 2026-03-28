package model;

public class Module extends CourseComponent {
    private int credits;

    public Module(String name, int credits) {
        super(name);
        this.credits = credits;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Module: " + name + " (" + credits + " credits)");
    }

    @Override
    public int getCredits() {
        return credits;
    }
}