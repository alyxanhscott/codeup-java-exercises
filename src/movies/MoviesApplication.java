package movies;
import java.util.Arrays;
import util.Input;



public class MoviesApplication {

    private static Input i = new Input();
    private static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {

        do {
            System.out.println("What would you like to do?");
            System.out.println("1 - view all movies\n2 - view movies in the animated category\n3 - view" +
                    " movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add a movie");
            System.out.println("Enter your number choice: ");
            int userChoice = i.getInt(1, 6);

            if (userChoice == 1) {
                for (Movie n : movies) {
                    System.out.println(n.getName() + " -- " + n.getCategory());
                }
            } else if (userChoice == 2) {
                for (Movie n : movies) {
                    if (n.getCategory().equals("animated")) {
                        System.out.println(n.getName() + " -- " + n.getCategory());
                    }
                }

            } else if (userChoice == 3) {
                for (Movie n : movies) {
                    if (n.getCategory().equals("drama")) {
                        System.out.println(n.getName() + " -- " + n.getCategory());
                    }
                }

            } else if (userChoice == 4) {
                for (Movie n : movies) {
                    if (n.getCategory().equals("horror")) {
                        System.out.println(n.getName() + " -- " + n.getCategory());
                    }
                }

            } else if (userChoice == 5) {
                for (Movie n : movies) {
                    if (n.getCategory().equals("scifi")) {
                        System.out.println(n.getName() + " -- " + n.getCategory());
                    }
                }
            } else if (userChoice == 6) {
                String name = i.getString("Enter name: ");
                String cat = i.getString("Enter category: ");
                movies = Arrays.copyOf(movies, movies.length + 1);
                movies[movies.length - 1] = new Movie(name, cat);
            }
        } while (i.yesNo("More movies?"));
    }
}
