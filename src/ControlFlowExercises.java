import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number between 1 and 7: ");
            int userNum = sc.nextInt();

            if (userNum == 1) {
                System.out.println("Sunday");
            } else if (userNum == 2) {
                System.out.println("Monday");
            } else if (userNum == 3) {
                System.out.println("Tuesday");
            } else if (userNum == 4) {
                System.out.println("Wednesday");
            } else if (userNum == 5) {
                System.out.println("Thursday");
            } else if (userNum == 6) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }

            System.out.println("Would you like to continue? Type yes or no: ");
        } while ("yes".equalsIgnoreCase(sc.next()));

    }
}

