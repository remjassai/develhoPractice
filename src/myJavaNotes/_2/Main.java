package myJavaNotes._2;

public class Main {
    public static void main(String[] args) {
        luunch todaysLuunch = new luunch(3.99, "Sunday");
        luunch tomorrowLuunch = new luunch(7.50, "Monday");

//        todaysLunch.nameOfDayEaten = "Sunday";
//        todaysLunch.price = 3.99;
//        tomorrowLunch.nameOfDayEaten = "Monday";
//        tomorrowLunch.price = 4.50;

        todaysLuunch.printLunch();
        tomorrowLuunch.printLunch();
    }
}
