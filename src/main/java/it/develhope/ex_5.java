package it.develhope;

public class ex_5 {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 9.00;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println("The square root of "+ value + " is " + valueSquareRoot);

    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        int valueA = 5;
        int valueB = 10;

        System.out.println("Max="+Math.max(valueA, valueB));
        System.out.println("Min="+Math.min(valueA, valueB));
        // Write your code here

        System.out.println("The numbers were " + valueA + " and " + valueB);

    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        int remainder = totalMoney % costPerBurger;
        int burgerPurchasingPower = Math.toIntExact(totalMoney/costPerBurger);

        System.out.println("If we had "+totalMoney+ "$ and a burger cost us "+ costPerBurger+"$");
        System.out.println("Than we may buy as many as " + burgerPurchasingPower + " burgers.");
        System.out.println("We would still be left with " + remainder + " bucks in our pocket.");

        System.out.println("Remainder=" + remainder);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // In these examples I thought of "n" as something similar to an int in java
        //Math.ceil is used to return the smallest or equal integer greater than or equal to the submitted value.
        //this is to say that any value from n.01 to n.99 will return n++
        //and all other will return n.00
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));

        //Math.floor is used to return the smallest or equal integer less than or equal to the submitted value.
        //this is to say that any value from n.00 to n.99 will return n.00
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));

        // Here the Math.round will return n for whatever negative or positive number ranging from n.000000000000000000 to n.9999999999999999999
        // and 0 for NaN
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));

        // The Math.pow will rise the first argument submitted, 4.5 in this example, to the n power where n is 2 for this specific case
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));

        // The Math.pow will rise the first argument submitted, 4.5 in this example, to the n power where n is 3 for this specific case
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));

        // The Math.random will return a random number ranging from 0.0 to ourValue but less than ourValue.
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }

}
