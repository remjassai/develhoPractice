package javaOOPadvanced._8;

class Fish extends Animal{
    private String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
        if(height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be greater than zero.");
        }
        this.species = species;
        setSpeed(swimSpeedMetersPerSecond());
        setName(species);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public double swimSpeedMetersPerSecond(){
        return getWeight()*2;
    }
}
