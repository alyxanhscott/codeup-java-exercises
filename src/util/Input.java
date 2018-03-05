package util;
import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
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
        int usernum = this.sc.nextInt();
        return (usernum >= min && usernum <= max) ? usernum : getInt(min, max);
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int usernum = this.sc.nextInt();
        return (usernum >= min && usernum <= max) ? usernum : getInt(prompt, min, max);
    }

    public int getInt(int userChoice) {
        int usernum = this.sc.nextInt();
        return usernum;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt(prompt);
    }

    public double getDouble(double min, double max) {
        double userdouble = this.sc.nextDouble();
        return (userdouble >= min && userdouble <= max) ? userdouble : getDouble(min, max);
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userdouble = this.sc.nextDouble();
        return (userdouble >= min && userdouble <= max) ? userdouble : getDouble(prompt, min, max);
    }

    public double getDouble() {
        double userdouble = this.sc.nextDouble();
        return userdouble;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return  getDouble();
    }
}
