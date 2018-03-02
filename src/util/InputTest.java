package util;

public class InputTest {

    public static void main(String[] args) {

        Input I = new Input();
        I.yesNo("Yes or no? ");
        I.getDouble("Enter a decimal between 1 and 10.5: ",1 , 10.5);
        I.getDouble("Enter a double: ");
        I.getInt("Enter a number between 1 and 20: ", 1, 20);
        I.getInt("Enter an integer: ");
        I.getString("Enter a statement: ");
    }
}
