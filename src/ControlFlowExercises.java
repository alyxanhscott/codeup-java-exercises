import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }


    }

}

