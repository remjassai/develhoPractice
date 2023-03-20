package javaOOPadvanced._8;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog pitbull = new Dog("pitbull", 0.45, 26.00);
        StringBuilder sb = new StringBuilder();  // I'm just playing with StringBuilder
        sb.append("Breed:").append(pitbull.getBreed()).append(", Height:").append(pitbull.getHeight()).append(", Weight:").append(pitbull.getWeight());
        System.out.println(sb);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish jellyFish = new Fish(2.00, 0.30, "jellyFish");
        System.out.println("Fish:"+jellyFish.getName()+ " height:"+ jellyFish.getHeight()+ " weight:"+jellyFish.getWeight());
        Bird quetzal = new Bird(0.40, 0.20, 0.5,"quetzal");
        System.out.println("Bird:"+quetzal.getName()+" height:"+ quetzal.getHeight()+" weight:"+quetzal.getWeight()+" wingspan:"+quetzal.getWingSpan());

    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog bullTerrier = new Dog("BullTerrier", 0.5, 33);
        Fish clowfish = new Fish(0.11, 0.30, "clownfish");
        Bird albatross = new Bird(1.23, 10, 3,"albatross");

        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(bullTerrier, clowfish, albatross));


        Animal fastestAnimal = null;
        double fastestMovement = 0;

        for(Animal animal : animals){
            if(animal.getSpeed()>fastestMovement){
                fastestMovement = animal.getSpeed();
                fastestAnimal = animal;
            }
        }
        System.out.println("The animal with the fastest movement is "+fastestAnimal.getName()+ " with "+fastestMovement+ " m/s.");

/*        Map<Animal, Double> velocity = new HashMap<>();
        for(Animal animal : animals){
            if(animal instanceof Dog){velocity.put(animal, ((Dog) animal).runSpeedMetersPerSecond());}
            else if(animal instanceof Fish) {velocity.put(animal, ((Fish) animal).swimSpeedMetersPerSecond());}
            else if(animal instanceof Bird) {velocity.put(animal, ((Bird) animal).flySpeedMetersPerSecond());}
        }
        Animal fastestMovement = null;
        double fastestSped = Integer.MIN_VALUE;
        for (Map.Entry<Animal,Double> entry : velocity.entrySet()) {
            if (entry.getValue() > fastestSped) {
                fastestSped = entry.getValue();
                fastestMovement = entry.getKey();
            }
        }
        System.out.println("The animal with the fastest movement is "+fastestMovement+ " with "+fastestSped+ " m/s.");*/


    }


}

