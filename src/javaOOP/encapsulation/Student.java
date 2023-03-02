package javaOOP.encapsulation;

public class Student {
    private static int idTotal = 0;
    private final int id;
    private String name;
    private int age;
    private String nationality;
    private static boolean isOver30;
    private String favoritePhrase;
    private int numOfTimesWeChangedNationality = 0;

    public Student(String name, int age, String nationality) {
        System.out.println("Constructing");
        this.id = idTotal++;
        this.name = name;
        this.age = age;
        isOver30 = getIsOver30();
        this.favoritePhrase = this.getFavoritePhrase();
        this.nationality = nationality;
        System.out.println("Constructed");
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if(name.matches(".*[0-9].*")) {
            System.out.println("Invalid name! You are not allowed to use special characters or numbers inside the name parameter!");
            this.name = null;
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 0 && age > 130){
            System.out.println("Invalid parameter! Age has to be a positive number les than 131.");
        }else{
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean getIsOver30() {
        isOver30 = age >= 30;
        return isOver30;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        if(favoritePhrase != null){
        this.favoritePhrase = favoritePhrase;
        }else{
            System.out.println("Can't change favorite phrase to null!");
        }
    }

    public String getNationality() {
        numOfTimesWeChangedNationality += 1;
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getNumOfTimesWeChangedNationality() {
        return numOfTimesWeChangedNationality;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


