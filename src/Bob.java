import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Tell me something: ");
            String response = sc.next();

            if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (response.equals("")) {
                System.out.println("Fine, be that way.");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Anything else? Yes or no dude..");
        } while ("yes".equalsIgnoreCase(sc.next()));

    }
}
