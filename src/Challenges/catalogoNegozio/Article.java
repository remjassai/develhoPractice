package Challenges.catalogoNegozio;

public class Article extends Product implements Discount{
    private int counterId = 0;
    private int id;
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
    public double getDiscount() {
        return discount;
    }

    @Override
    public void applyDiscount() {
        double discountedPrice = getPrice() * (100 - discount) / 100;
        setPrice(discountedPrice);
    }

    @Override
    public void setDiscount(double discountPercent) {
        this.discount = discountPercent;
    }

}
