package it.develhope;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

public class ex_16 {

    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!


        Long myLongTypeBankBalanceEuro;

        myLongTypeBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;

        System.out.println(myLongTypeBankBalanceEuro);
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --- byte => because normally a person don't go beyond 127 years of age
     *    2b: The age of a baby in months --- short => because a year have just 12 months
     *    2c: Money in a hedgefund in euros --- long => because a hedgefund is supposed to manage big numbers
     *    2d: Price of a good in euros on amazon.com --- float => because the price is represented with 2 decimal places usually
     *    2e: The exact weight of an apple measured by scientific equipment --- double => because we need to be very precise and it is useful to have more decimal places
     *    2f: The number of kilometers from any 2 places in the world --- int => because we can't use short as the earth has a circumference of more or less 40_000km
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        System.out.println("Today is " + LocalDate.now());
        LocalDate myDate = LocalDate.of(2023, Month.FEBRUARY, 23);
        System.out.println(myDate);
        System.out.println("This is the "+myDate.getDayOfMonth()+"th day of this month.");
        System.out.println("Today is "+myDate.getDayOfWeek());
        System.out.println( "This is the "+myDate.getDayOfYear()+ "th day of this year.");
        System.out.println(myDate.getMonth());
        System.out.println("This is the "+myDate.getMonthValue()+"th month of the year.");


        LocalDate myBirthDay = LocalDate.of(1988, Month.JUNE, 7);
        System.out.println("My birthday is before today: "+myBirthDay.isBefore(myDate));
        System.out.println("My birthday is after today: "+myBirthDay.isAfter(myDate));





    }
}
