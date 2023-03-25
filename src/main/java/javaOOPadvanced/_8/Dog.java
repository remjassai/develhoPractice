package javaOOPadvanced._8;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, double height, double weight){
        super(height, weight);
        if(height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be greater than zero.");
        }
        this.breed = breed;
        setSpeed(runSpeedMetersPerSecond());
        setName(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond(){
        return getHeight()*2.00;
    }
}
