import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 100;
        do {
        System.out.println("i is: " + i);
            i -= 5;
        } while (i >= -10);
    }
}
