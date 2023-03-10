package javaOOPadvanced._6;

import javaOOPadvanced._6.Days;
import javaOOPadvanced._6.Seasons;
import javaOOPadvanced._6.TrafficLight;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for(Days days: Days.values()) {
            System.out.println(days);
        }

    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons seasons = Seasons.FALL;
        switch (seasons){
            case WINTER-> System.out.println(seasons.getMonths());
            case FALL-> System.out.println(seasons.getMonths());
            case SPRING -> System.out.println(seasons.getMonths());
            case SUMMER-> System.out.println(seasons.getMonths());
        }


    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        getNextLight(TrafficLight.RED);
    }
public static TrafficLight getNextLight(TrafficLight currentLightColor) {
        switch(currentLightColor){
            case RED -> System.out.println(currentLightColor.GREEN);
            case YELLOW -> System.out.println(currentLightColor.RED);
            case GREEN -> System.out.println(currentLightColor.YELLOW);
        }
        return currentLightColor;}
    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days myDay = Days.MONDAY;
       if(myDay.isWeekend()) {
           System.out.println("It's party time!!!");
       }else{
           System.out.println("It's work time!!!");
       }

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here


        int num1 = 5;
        int num2 = 2;
        Operator op1 = Operator.DIVIDE;
        Double result = op1.apply(num1,num2);
        System.out.println(result);
        opMethod(num1, num2, op1);
    }

    public static Operator opMethod(int arg1, int arg2, Operator op){
        switch(op){
            case ADD-> System.out.println(arg1 + arg2);
            case SUBTRACT-> System.out.println(arg1 - arg2);
            case MULTIPLY-> System.out.println(arg1 * arg2);
            case DIVIDE -> System.out.println(arg1 / arg2);
        }

        return op;
    }

}
