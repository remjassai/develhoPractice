package javaOOPadvanced._9;

public abstract class Instrument implements Playable {
    // an abstract class called "Instrument"
    // that implements the Playable interface
    // and contains the fields "name" and "brand"
    private String name;
    private String brand;

    protected Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("The " + name + " is playing.");
    }

}
