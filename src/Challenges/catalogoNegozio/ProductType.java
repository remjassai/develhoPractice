package Challenges.catalogoNegozio;

public enum ProductType {
    UNDERWEAR("underpants","silk 100%"),
    FOOTWEAR("shoes","made with 100% recycled materials"),
    SLEEPWEAR("pyjamas", "hemp 100%");

    private final String name;
    private final String description;

    ProductType(String name, String description) {
        this.name=name;
        this.description = description;
    }
    public String getName() {return name;}
    public String getDescription(){return description;}
}
