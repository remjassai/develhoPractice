package Challenges.shopCatalog.products;

import Challenges.shopCatalog.Discount;

public class Article extends Product implements Discount {
    private static int counterId = 0;
    private int id;
    private String description;
    private ProductType productType;
    private double discount = 0.0;

    public Article(String name, double price) {
        super(name, price);
        this.id =++counterId;
    }

    public Article(String name, double price, ProductType productType) {
        super(name, price);
        this.id=++counterId;
        this.description = productType.getDescription();
        this.productType = productType;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getDescription(){
        return description;
    }

    public ProductType getType() {
        return productType;
    }


    public double getDiscount() {
        return discount;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void printInfo(){
        System.out.println("Product ID: " + this.id + ", Name: "+ this.name+ ", " + getType()+ ", " + getDescription() + ", Price: " + this.getPrice() + "€");
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateDiscountPrice() {
        return price * (100 - discount) / 100;
    }

    @Override
    public String toString() {
        return name + "," + price + "," + productType;
    }
}
