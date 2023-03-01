package JavaOOP.encapsulation;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student rem = new Student("Rem", 23, "Romania");
        rem.setFavoritePhrase("Jassai never die!");
        Student greg = new Student("Greg",42, "England");
        greg.setFavoritePhrase("Time never ends!");
        System.out.println("Student "+rem.getName()+" is over 30 years old: " + rem.getIsOver30()+ ". He is "+rem.getAge()+" years old.");
        System.out.println("His ID number is: "+rem.getId() +" and he comes from: "+rem.getNationality());
        rem.setNationality("Italian");
        System.out.println("He has now also the "+rem.getNationality()+" nationality.");
        System.out.println("So he changed his nationality " + rem.getNumOfTimesWeChangedNationality() + " times.");
        System.out.println("His favorite phrase is "+rem.getFavoritePhrase());
        System.out.println("Student "+greg.getName()+" is "+greg.getAge()+" years old.");
        System.out.println("His favorite phrase is "+greg.getFavoritePhrase());
        System.out.println("His ID number is: "+greg.getId() +" and he comes from: " + greg.getNationality());



    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here

        Student carlos = new Student("Carl0s", 25, "Spain");
        System.out.println("Student "+carlos.getName()+" is over 30 years old: " + carlos.getIsOver30()+ ". He is "+carlos.getAge()+" years old.");
        carlos.setName("Carl0s");
        carlos.setAge(255);
        Student juan = new Student("Juan", 30, "Spain");
        System.out.println("Student "+juan.getName()+" is over 30 years old: " + juan.getIsOver30());

    }

}
