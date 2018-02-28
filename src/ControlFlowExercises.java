import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number to go up to: ");
            int userNum = sc.nextInt();

            String tableFormat = "%-6d | %-7d | %-5d%n";
            System.out.format("number | squared | cubed%n");

            for (int i = 1; i <= userNum ; i++) {
                int squ = (int)(Math.pow(i, 2));
                int cub = (int)(Math.pow(i, 3));
                System.out.format(tableFormat, i, squ, cub);
            }
            System.out.println("Would you like to continue? Type yes or no: ");
        } while ("yes".equalsIgnoreCase(sc.next()));

    }
}

