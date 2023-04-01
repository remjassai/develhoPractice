package Challenges.shopCatalog.products;

public enum ProductType {
    UNDERWEAR("underpants","silk 100%"),
    FOOTWEAR("shoes","made with 100% recycled materials"),
    SLEEPWEAR("pyjamas", "hemp 100%");
     //attributes
    private final String name;
    private final String description;
    ///constructor
    ProductType(String name, String description) {
        this.name=name;
        this.description = description;
    }
    //getters
    public String getName() {return name;}
    public String getDescription(){return description;}
}
