import java.util.Scanner;

public class HighLow {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessing();
    }

    public static int number(int min, int max) {

        System.out.printf("Enter a number between %d and %d\n", min, max);
        int usernum = sc.nextInt();

        if (min <= usernum && max >= usernum) {
            System.out.println(usernum + " qualifies.");
        } else {
            usernum = number(min, max);
        }

        return usernum;
    }

    public static int random(int min , int max) {
        return (int)(Math.random() * (max - min) + min);
    }

    public static void guessing() {

        int randomNumberGen = random(1, 100);

        do {
            System.out.println("Enter a number, I will tell you how close you are: ");
            int userGuess = number(1, 100);

            if (userGuess < randomNumberGen) {
                System.out.println("Guess higher!");
            } else if (userGuess > randomNumberGen) {
                System.out.println("Guess lower!");
            } else {
                System.out.println("Got it!");
                System.out.println("Continue playing? Y/N");
                if ("y".equalsIgnoreCase(sc.next())) {
                    guessing();
                } else {
                    return;
                }
            }
        } while (true);
    }

}
