import java.util.Scanner;

public class MethodsExercises {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        dice();
        factorial();
    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        int sum = 0;
        for (int i = 0; i < y; i++) {
            sum += x;
        }
        return sum;
    }
    public static float divide(float x, float y) {
        return x / y;
    }
    public static int mod(int x, int y) {
        return x % y;
    }

    public static int number(int min, int max) {

        System.out.println("Enter a number between" + min +  "and" + max + ": ");
        int usernum = sc.nextInt();

            if (min <= usernum && max >= usernum) {
                System.out.println("Your number is: " + usernum);
            } else {
                number(min, max);
            }

        return usernum;
    }
//
    public static void factorial() {
        do {
            int userInput = number(1, 20);
            long factorial = 1L;
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
            System.out.println("Your factorial: " + factorial);
            System.out.println("Continue? Y/N");
        } while ("y".equalsIgnoreCase(sc.next()));

    }

    public static int rand(int usersides) {
        return (int)(Math.random() * usersides + 1);
    }

    public static void dice() {

        do {
            System.out.println("How many sides does your dice have?: ");
            int usersides = sc.nextInt();
            System.out.printf("Sides: %d & %d\n", rand(usersides), rand(usersides));
            System.out.println("Continue? Y/N");
        } while ("y".equalsIgnoreCase(sc.next()));
    }

}
