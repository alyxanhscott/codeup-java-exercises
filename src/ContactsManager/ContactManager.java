package ContactsManager;

import util.Input;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static util.FileHelper.slurp;
import static util.FileHelper.spit;


public class ContactManager {

    private static Input in = new Input();
    
    private static final String CONTACT_FILE = "src/ContactsManager/contacts";
    private static List<String> contacts = new ArrayList<>();

    public static String addPhoneNumber() {
        String num = in.getString("Enter a 10 digit phone number: ");
        if (num.length() == 10) {
            return num;
        } else {
            return addPhoneNumber();
        }
    }

    public static String addName() {
        String name = in.getString("Enter a name: ");
        return name;
    }

    public static void searchContact() {
        String search = in.getString("Type a name to search: ");
        for(String c: contacts) {
            if (search.equalsIgnoreCase(c.split(" ")[0])) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Sorry, that search returned no results");
        searchContact();
    }

    public static void deleteContact() {
        String searchToDelete = in.getString("Type a name to search and delete: ");
        for (String d: contacts) {
            if (searchToDelete.equalsIgnoreCase(d.split(" ")[0])) {
                contacts.remove(d);
                return;
            }
        }
        System.out.println("Sorry, search returned no results");
        deleteContact();
    }

    public static void main(String[] args) {

        contacts = slurp(CONTACT_FILE);

        do {
            System.out.println("1 - View all contacts\n2 - Add new contact\n3 - Search by contact name\n4 - Delete existing contacts\n5 - Exit\n");
            int userChoice = in.getInt("Enter an option, 1-5: ", 1, 5);

            if (userChoice == 1) {
                System.out.printf("%-10s | %-12s\n", "Name", "Phone Number");
                for(String line: contacts) {
                    String[] info = line.split(" ");
                    System.out.printf("%-10s | %-12s\n", info[0], info[1]);
                }
            } else if (userChoice == 2) {
                String name = addName();
                String number = addPhoneNumber();
                contacts.add(String.format("%s %s", name, number));
            } else if (userChoice == 3) {
                searchContact();
            } else if (userChoice == 4) {
                deleteContact();
            } else if (userChoice == 5) {
                System.out.println("Goodbye.");
                break;
            }
        } while (in.yesNo("Continue work?"));
    }
}

