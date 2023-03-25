package myJavaNotes.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch(3.99, "Sunday");
        System.out.println(todaysLunch.price);
        double newPrice = 5.50;
        todaysLunch.setPrice(newPrice);
        System.out.println(todaysLunch.price);
    }

}
