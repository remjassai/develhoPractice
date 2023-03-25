package it.develhope;

public class ex_3 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 34;
        System.out.println("I'm " + myAge+ " years old.");
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char myInitial = 'R';
        int myAge = 34;
        System.out.println("My real age is " + myAge +" and the first letter of my name is " + myInitial);

    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        //This will print a string specifying the exercise number
        System.out.println("\nExercise 3:");
        //declaration and initialization of a boolean variable
        boolean hasEatenLunch = false;
        //declaration and initialization of a type of floating number variable
        double lunchCost = 5.99;
        //print to the console a string joint with a call to the lunchCost variable
        System.out.println("Lunch cost=" + lunchCost);
        //print to the console a string joint with a call to the hasEatenLunch variable
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }

}
