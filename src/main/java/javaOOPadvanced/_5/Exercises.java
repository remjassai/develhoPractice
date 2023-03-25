package javaOOPadvanced._5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Error creating");
        }
    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        String userInputFileName = "test-file.txt";
        try {
            FileReader reader = new FileReader(userInputFileName);
      //      reader.read(userInputFileName);
        } catch (FileNotFoundException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat error!" + e.getMessage());
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        try{
         System.out.println(num1 / Double.parseDouble(num2AsString));
        }catch(Exception e){
            // Your catch blocks here
            if (e instanceof NumberFormatException) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            } else if (e instanceof ArithmeticException) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } else {
                System.out.println("Caught unexpected exception: " + e.getMessage());
            }
        }

    }
}
