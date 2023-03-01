package myJavaNotes.Encapsulation;

                                        // getters and setters (accessors and mutators)

public class Lunch {
    Double price = null;
    String nameOfDayEaten = null;
    int lunchWeightInGrams;
    static double maxPrice = 5;  //This is static because it is referring to Lunch itself not to an individual instance or a lunch object in particular
    Lunch(Double price, String nameOfDayEaten) {
        System.out.println("We ran our constructor 1");
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }
    Lunch(Double price){
        System.out.println("We ran our constructor 2");
        this.price = price;
    }
    public Lunch(){
        System.out.println("We ran our constructor 3");
    }
    public void printLunch(){
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    void setPrice(double price){
        if(price > maxPrice){
            System.out.println("Cannot set greater than max price");
        }else{
            this.price = price;
        }
    }
}
