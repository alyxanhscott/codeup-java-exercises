package grades;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {



    public static void main(String[] args) {
        Input i = new Input();
        HashMap<String, Student> students = new HashMap<>();
        students.put("alyxanhscott", new Student("Allie", new ArrayList<>(Arrays.asList(97, 95, 100, 50))));
        students.put("TristanCrawford", new Student("Tristan", new ArrayList<>(Arrays.asList(100, 100, 100, 100))));
        students.put("jerico", new Student("John", new ArrayList<>(Arrays.asList(100, 95, 100, 10))));
        students.put("alexbous", new Student("Alex", new ArrayList<>(Arrays.asList(97, 100, 100, 50))));
        do {
            for (String gh: students.keySet()) {
                System.out.printf("|%s| ", gh);
            }
            System.out.println("\nSelect student to view.");
            String selectedUser = i.getString("> ");
            if (students.containsKey(selectedUser)) {
                Student s = students.get(selectedUser);
                System.out.printf("Name: %s, Github username: %s\nAverage: %d\n",s.getStudentName(), selectedUser, s.avGrades());
            } else {
                System.out.println("No student found with that username.");
            }
        } while (i.yesNo("Would you like to see another student? Y/N"));
    }
}
