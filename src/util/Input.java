package util;
import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public int getBinary() {
        try {
            int x = Integer.valueOf(sc.nextLine(), 2);
            return x;
        } catch (NumberFormatException e) {
            System.out.println("Error, enter a binary value.");
            return getBinary();
        }
    }

    public int getHex() {
        try {
            int x = Integer.valueOf(sc.nextLine(), 16);
            return x;
        } catch (NumberFormatException e) {
            System.out.println("Error, enter a hex value.");
            return getHex();
        }
    }

    public String getString() {
        String userAnswer = this.sc.next();
        return userAnswer;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        String userAnswer = this.sc.next();
        return "y".equalsIgnoreCase(userAnswer) || "yes".equalsIgnoreCase(userAnswer);
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        try {
            int usernum = Integer.parseInt(this.sc.nextLine());
        return (usernum >= min && usernum <= max) ? usernum : getInt(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Error, enter a number between specified fields.");
            return getInt();
        }
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int usernum = this.sc.nextInt();
        return (usernum >= min && usernum <= max) ? usernum : getInt(prompt, min, max);
    }

    public int getInt() {
        try {
        int usernum = Integer.parseInt(this.sc.nextLine());
        return usernum;
        } catch (NumberFormatException e) {
            System.out.println("Error, input an integer.");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        try {
            double userdouble = Double.parseDouble(this.sc.nextLine());
            return (userdouble >= min && userdouble <= max) ? userdouble : getDouble(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Error, enter a number between specified fields.");
            return getDouble();
        }
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userdouble = this.sc.nextDouble();
        return (userdouble >= min && userdouble <= max) ? userdouble : getDouble(prompt, min, max);
    }

    public double getDouble() {
        try {
            double userdouble = Double.parseDouble(this.sc.nextLine());
            return userdouble;
        } catch (NumberFormatException e) {
            System.out.println("Error, enter a valid double");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return  getDouble();
    }
}
