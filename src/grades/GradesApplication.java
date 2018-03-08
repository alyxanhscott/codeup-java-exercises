package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("alyxanhscott", new Student("Allie", new ArrayList<>(Arrays.asList(97, 95, 100, 50))));
        students.put("tristanC", new Student("Tristan", new ArrayList<>(Arrays.asList(100, 100, 100, 100))));
        students.put("jerico", new Student("John", new ArrayList<>(Arrays.asList(100, 95, 100, 10))));
        students.put("alexbous", new Student("Alex", new ArrayList<>(Arrays.asList(97, 100, 100, 50))));

        for (Map.Entry<String, Student> student: students.entrySet()) {
            String githubUsername = student.getKey();
            Student studentVal = student.getValue();

            System.out.println(githubUsername + ": " + studentVal.avGrades());
        }


    }
}
