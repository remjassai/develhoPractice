package javaOOPadvanced._4;

import javax.lang.model.element.NestingKind;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) throws IOException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant
/*    try{
        Files.createFile(file.MY_PATH);
        Files.writeString(MY_PATH, myString);
    }catch(Exception exception){
        System.err.println("There was an error");
        Exception.printStackTrace();
        System.exit(0);
    }*/

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy F__KING dog
                """;

        try {
            Files.deleteIfExists(MY_PATH);
            Files.createFile(MY_PATH);

            // Your code here
            Files.write(MY_PATH, myString.getBytes());
//            System.out.println(MY_PATH);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            System.out.println(Files.readString(MY_PATH));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

     /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() throws IOException {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split
        List<String> lines = new ArrayList<String>(List.of(Files.readString(MY_PATH).split("\n")));
        try {
            // Your code here
            int count = 0;
            for (String line: lines) {
            count++;
        }
            System.out.println(lines.size() + " line(s)");

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() throws IOException {
        System.out.println("\nExercise 4: ");
        List<String> words = new ArrayList<String>(List.of(Files.readString(MY_PATH).split(" ")));
        try {
            // Your code here
            int counter = 0;
            for (String word : words) {
                counter++;
            }
            System.out.println( counter + " words");
            Files.delete(MY_PATH);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
            if(!Files.exists(myDirectoryPath)){
                Files.createDirectory(myDirectoryPath);
            }
            Path myFilePath = myDirectoryPath.resolve("file.text");
            Files.writeString(myFilePath, "Why am I in a folder?");
            System.out.println(Files.readString(myFilePath));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
