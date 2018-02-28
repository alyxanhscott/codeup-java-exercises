import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number(1, 10);
    }

//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static int subtract(int x, int y) {
//        return x - y;
//    }
//    public static int multiply(int x, int y) {
//        int sum = 0;
//        for (int i = 0; i < y; i++) {
//            sum += x;
//        }
//        return sum;
//    }
//    public static float divide(float x, float y) {
//        return x / y;
//    }
//    public static int mod(int x, int y) {
//        return x % y;
//    }

    public static int number(int min, int max) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number between 1 and 10: ");
        int usernum = sc.nextInt();

            if (min <= usernum && max >= usernum) {
                System.out.println("Your number is: " + usernum);
            } else {
                number(min, max);
            }

        return usernum;
    }

}
