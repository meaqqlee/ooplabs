public class Course {
    private String courseName;
    private String description;
    private int credits;
    private String prerequisites;

    public Course(String name,
                  String description,
                  int numberOfCredits,
                  String prerequisites)
    {
        this.courseName = courseName;
        this.description = description;
        this.credits = numberOfCredits;
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return "Course: " + courseName +
                " (" + credits + " credits). " + description +
                " Prerequisites: " + prerequisites;
    }
}
