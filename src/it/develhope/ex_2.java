package it.develhope;

import java.sql.SQLOutput;

public class ex_2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        String r = new String("Remus");
        String g = new String("Gosav");
        String x = new String("X");
     //   char ch1;
     //  ch1 = 88;
        System.out.print(r.charAt(0));
        System.out.print(g.charAt(0));
        System.out.println(x);
        // This line will print X
       // System.out.print(ch1);

    }

/**
 * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
 * had lunch today as a boolean literal i.e. true, false, then print the price of
 * your lunch as a double, i.e. 4.99
 */
private static void exercise2() {
    System.out.println("\nExercise 2:");
    // Write your code here

    System.out.println( "Age: " +31);
    System.out.println("Today I had lunch:" + false);
    System.out.println("Lunch cost: €" + 3.46);

}

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int age = 34;
        boolean hadLunchToday = false;
        double lunchPriceInEuro = 3.45;

        System.out.println( "I'm " +age+ " years old.");
        System.out.println("Today I had lunch: " +hadLunchToday);
        System.out.println("The lunch cost me " +lunchPriceInEuro+"€ every day.");

        };
    }
