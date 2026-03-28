package model;

public class SubModule extends CourseComponent {
    private int credits;

    public SubModule(String name, int credits) {
        super(name);
        this.credits = credits;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "SubModule: " + name + " (" + credits + " credits)");
    }

    @Override
    public int getCredits() {
        return credits;
    }
}