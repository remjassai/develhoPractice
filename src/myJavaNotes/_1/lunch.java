package myJavaNotes._1;

public class lunch {
    double price = 5 * Math.random();  //If you make this line static then the price of both: today and tomorrow lunches will have the same price as they will refer to the same Lunch class and will no longer refer to the two objects or instances of the class(framework).
    String nameOfDayEaten = null; // this is the same as: new String("");

    void printLunchPrice() {
        System.out.println("price:" + price);
    }
}
