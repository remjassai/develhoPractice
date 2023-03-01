package myJavaNotes.ScopeAccessmodifiersStaticFinal;

public class Main {
    public static void main(String[] args) {
    Lunch todaysLunch = new Lunch(3.99, "Sunday");
        System.out.println(todaysLunch.price);
        System.out.println(todaysLunch.getNumberOfTimesWeHaveGotPrice());
    }
}
