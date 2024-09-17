import Student.Student;
import java.util.List;
import java.util.HashMap;

public class GradeBook {
    Course course;
    List<String> students;
    HashMap<Student, Integer> grades;

    public String messageToDisplay() {
        return "Welcome to the grade book for" + course.toString();
    }

    public String DisplayGradeReport() {
        int sum = 0;
        int highest = Integer.MAX_VALUE;
        int loweset = Integer.MIN_VALUE;
        Student highestStudent = null;
        Student lowestStudnent = null;

        for(Student student : students) {
            int grade = students.getor
        }
    }
}
