package util;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Arrays;


public class FileHelper {

    public static List<String> slurp (String filepath) {
        List<String> data = new ArrayList<>();
        try {
        Path p = Paths.get(filepath);
        data = Files.readAllLines(p);
        } catch (IOException e) {
            System.out.println("Caught, something went wrong.");
            e.printStackTrace();
            System.exit(1);
        }
        return data;
    }

    public static void spit (String filename, List<String> contents) {
        try {
            Files.write(Paths.get(filename), contents, StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("Caught, something went wrong.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void makeExciting(String filename) {
        List<String> input = new ArrayList<>();
        for (String s :slurp(filename) ) {
            input.add(s.toUpperCase() + "!");
        }
        spit(filename + ".exciting", input);
    }

    public static void main(String[] args) {
        List<String> testList = Arrays.asList("# Test", "# Test1", "# Test2");
        spit("test1", testList);
        slurp("test1");

        for (String s: slurp("test1")) {
            System.out.println(s);
        }
    }

}

