package javaProduction._12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
//        System.out.println(ourNumbers);
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        List<Integer> pairNumbers = new ArrayList<Integer>();

        ourNumbers.stream().filter(
                num ->  num % 2 == 0
        ).forEach(
                num ->System.out.println(num)
        );
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        ourNumbers.stream().filter(num ->  num % 2 != 0)
                .collect(Collectors.toSet())
                .forEach(num -> System.out.println(num));

    }

    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here

        alice.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()).forEach(name-> System.out.println(name));
//        alice.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

    }

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        ourNumbers.stream().filter(n -> n%2 == 0).map(n ->n*2).collect(Collectors.toSet()).forEach(n -> System.out.println(n));

    }
}
