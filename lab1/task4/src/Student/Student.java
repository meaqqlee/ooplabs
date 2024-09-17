package Student;

public class Student {
    private String name;
    private int year;
    private final int id;

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void incrementYear() {
        this.year++;
    }

    public String toString() {
        return "Student " + name + " (ID: " + id + "), Grade: " + year;
    }
}

