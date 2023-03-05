/*
package myJavaNotes.Collection;

public class Meal {
    private Double price;
    private Integer weightInGrams;
    private Set<String>ingredients;
    public Meal(Double price, Inreger weightInGrams, Set<String>ingredients) {
        this.price = price;
        this.weightInGrms = weight;
        this.ingredients = ingredients;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Inreger getWeightInGrams() {
        return weightInGrams;
    }
    public void setWeightInGrams(Inreger weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price + "EUR"+
                ", weightInGrams=" + weightInGrams +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal)) return false;

        Meal meal = (Meal) o;

        return ingredients != null? ingredients.equals(meal.ingredients) : meal.ingredients == null;
    }
    @Override
    public int hashCode() {
        return ingredients!= null? ingredients.hashCode() : 0;
    }
}
*/
