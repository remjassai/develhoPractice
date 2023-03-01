package myJavaNotes._2;

public class luunch {
    // double can't be null because it is a primitive type.
    // but we can use a Double object.
    Double price = null;
    String nameOfDayEaten; // this is the same as: new String("");
    //int lunchWeightInGrams;

    static Double maxLunchPrice = 5.50; //you use static here because this isn't specific to a lunch in particular but to any lunch ever created.
   luunch(Double price, String nameOfDayEaten) {
        System.out.println("We run our constructor!");
       if (price >= maxLunchPrice) {
           System.out.println("Worning! Exceeded max lunch price. Not setting.");
       }else{
           System.out.println("Lunch price is okay, setting.");
           this.price = price;
       }
      //  this.lunchWeightInGrams = 50;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                        "price=" + price +
                        ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                        '}');
    }



}
