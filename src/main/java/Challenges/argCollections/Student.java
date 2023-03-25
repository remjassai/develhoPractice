package Challenges.argCollections;

public class Student {
    private String name;
    private String surname;
    private int idTot = 0;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String surname, int id) {

        this.name = name;
        this.surname = surname;
        this.id = ++idTot;

    }
}
