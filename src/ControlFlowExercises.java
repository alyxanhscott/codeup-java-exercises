import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a grade between 0-100: ");
            int userGrade = sc.nextInt();

            if (userGrade >= 88) {
                System.out.println("Grade: A (100-88)");
            } else if (userGrade <= 87 && userGrade >= 80) {
                System.out.println("Grade: B (87-80)");
            } else if (userGrade <= 79 && userGrade >= 67) {
                System.out.println("Grade: C (79-67)");
            } else if (userGrade <= 66 && userGrade >= 60) {
                System.out.println("Grade: D (66-60)");
            } else {
                System.out.println("Grade: F (59-0)");
            }

            System.out.println("Would you like to continue? Type yes or no: ");
        } while ("yes".equalsIgnoreCase(sc.next()));

    }
}

