package it.develhope;

import java.util.Arrays;
import java.util.List;

public class ex_15 {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function


        // End
        System.out.println(conversionCelsToFar());
    }


    public static String conversionCelsToFar (){
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " Fahrenheit";
        return conversionDescription;
    }



    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for(String name : names ){
            // Call your function
            System.out.println(nameFormating(name));
        }

    }


    public static String nameFormating(String name) {
        if(name.matches(".*[0-9].*")){
            return "Invalid";
        }

        return name.toUpperCase().trim();
       }
    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        printVar(myLunchPrice, lunchType, description, weightInGrams);
        printVar(7.99, "hamburger", "carne", 500);
    }

    private static void printVar(double myLunchPrice, String lunchType, String description, int weightInGrams){

        System.out.println( myLunchPrice + " " + lunchType + " " + description + " " +weightInGrams );

    }

}
