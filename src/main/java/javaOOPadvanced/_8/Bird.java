package javaOOPadvanced._8;

class Bird extends Animal{
    private double wingSpan;
    private String species;

    public Bird(double height, double weight, double wingSpan, String species) {
        super(height, weight);
        this.wingSpan = wingSpan;
        if(height <= 0 || weight <= 0 || wingSpan <= 0) {
            throw new IllegalArgumentException("Height, weight, and wing span must be greater than zero.");
        }
        this.species = species;
        setSpeed(flySpeedMetersPerSecond());
        setName(species);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return wingSpan*4;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                '}';
    }
}