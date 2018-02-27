import java.awt.*;
import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int userInteger;
//        System.out.print("Enter a number: ");
//        userInteger = sc.nextInt();
//        System.out.println("You entered: \"" + userInteger + "\" ");
//
//        String wordOne;
//        String wordTwo;
//        String wordThree;
//        System.out.println("Enter 3 words: ");
//        wordOne = sc.next();
//        wordTwo = sc.next();
//        wordThree = sc.next();
//        System.out.printf("%s\n%s\n%s\n", wordOne, wordTwo, wordThree);
//
//        String sentence;
//        System.out.println("Enter a sentence: ");
//        sentence = sc.nextLine();
//        System.out.println("You put: \n" + sentence);

        float length;
        float width;
        float height;
        System.out.println("Enter width: ");
        width = sc.nextFloat();
        System.out.println("Enter length: ");
        length = sc.nextFloat();
        System.out.println("Enter height: ");
        height = sc.nextFloat();
        float area = length * width;
        float perimeter = (length * 2) + (width * 2);
        float volume = length * width * height;
        System.out.println("The area is: " + area + ", the perimeter is: " + perimeter + ", the volume is: " + volume);


    }

    }
