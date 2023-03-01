package myJavaNotes.ScopeAccessmodifiersStaticFinal;

public class Lunch {
    private String nameOfDayEaten = null;
    Double price = null;
    private int lunchWeightInGrams;
    private static double maxPrice = 5;
    private int numberOfTimesWeHaveGotePrice = 0;
    Lunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }
    public void printLunch() {
        System.out.println("Lunch{" +
                "price="+ price +
                ", nameOfDayEaten=" + nameOfDayEaten +
                ", lunchWeightInGrams=" + lunchWeightInGrams + '\''+
                '}');
    }
    void setPrice(double price) {
        if (price > maxPrice) {
            System.out.println("Cannot set price greater than " + maxPrice);
        }else {
            this.price = price;
        }
    }
    Double getPrice() {
        numberOfTimesWeHaveGotePrice += 1;
        return this.price;
    }

    int getNumberOfTimesWeHaveGotPrice() {
        return numberOfTimesWeHaveGotePrice;
    }
}
