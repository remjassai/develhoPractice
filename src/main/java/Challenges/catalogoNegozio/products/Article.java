package Challenges.catalogoNegozio.products;

import Challenges.catalogoNegozio.Discount;

public class Article extends Product implements Discount {
    private int counterId = 0;
    private final int id;
    private String description;
    private ProductType type;
    private double discount;

    public Article(String name, double price, String description, ProductType productType) {
        super(name, price);
        this.id =++counterId;
        this.description = description;
        this.type = productType;
        this.discount = 0;
    }

    public int getId() {
        return id;
    }
    public String getDescription(){
        return description;
    }

    public ProductType getType() {
        return type;
    }




    @Override
    public void applyDiscount(double discountPercent) {
        this.discount = discountPercent;
    }

    @Override
    public double calculateDiscountPrice() {
        return this.getPrice() * (100 - discount) / 100;
    }

    @Override
    public String toString() {
        return name + "," + price + "," +type.getName();
    }
}
