import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(divide(7.5f,2.4f));
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

}
