package javaProduction._11;
import java.math.RoundingMode;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {



    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();


    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x =  Math.random()*100;
        String returnString = "x is " + (x >= 50? "greater or equal to 50: "+ x: " less than 50: "+ x);
        System.out.println(returnString);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person1 = new Person("Mat", 23, "via Calatafimi 5, Falconara(AN), Italia");
        System.out.println(person1);



    }
    public record Person(String name, int age, String address ){
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    };

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger myBigInt = new BigInteger("314159265358979323846264000000000000000000000000000000000");
        BigInteger bigIntDivisionResult;
        bigIntDivisionResult = myBigInt.divide(BigInteger.valueOf(3));
        System.out.println(bigIntDivisionResult);
        BigDecimal myBigDecimal = new BigDecimal("2.222222222222222222222222222222222222222222222222");
        BigDecimal bigDecimalDivisionResult = myBigDecimal.divide(BigDecimal.valueOf(Math.PI), 50, RoundingMode.HALF_UP);
        System.out.println(bigDecimalDivisionResult);
    }

}
