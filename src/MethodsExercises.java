import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mod(9,2));
    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int mod(int x, int y) {
        return x % y;
    }

}
