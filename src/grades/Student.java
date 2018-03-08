package grades;
import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> studentGrades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.studentGrades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade (int grade) {
        this.studentGrades.add(grade);
    }

    public int avGrades() {
        int sum = 0;
        for (int i: this.studentGrades) { sum += i; }
        return sum / this.studentGrades.size();
    }
}




