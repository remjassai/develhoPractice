package javaOOP.finalScopeStaticAccessModifiers;

 public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;

    private static final double MAX_PRICE = 5;

    private static final double MIN_PRICE = 0;

    private static final int MAX_WEIGHT = 550;

    private static final int MIN_WEIGHT = 0;


    private int numberOfTimesWeHaveGotPrice = 0;

    public ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {
        System.out.println("The value of the max price is: " + MAX_PRICE);
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    public void setPrice(double price) {
        if (price > MAX_PRICE || price < MIN_PRICE) {
            System.out.println("The price cannot be set as greater than: "+ MAX_PRICE + " or less than: " + MIN_PRICE);
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice += 1;
        return this.price;
    }

    public int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNameOfDayEaten(String nameOfDayEaten) {

        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void setLunchWeightInGrams(int lunchWeightInGrams) {
        if(lunchWeightInGrams > MAX_WEIGHT || lunchWeightInGrams < MIN_WEIGHT){
            System.out.println("Weight cannot be set as greater than max weight in grams: "+ MAX_WEIGHT +" or less than min weight in grams: "+ MIN_WEIGHT);
        }else{
            this.lunchWeightInGrams = lunchWeightInGrams;
        }

    }

    public void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
