package tutorExercies.footballPlayer;

public class FootballPlayer {
    //fields

    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;
    private int presencesNumber;
    private int golsNumber;
    private int assistsNumber;




    //constructors
    public FootballPlayer(String name, String surname, int presencesNumber, int golsNumber, int assistsNumber) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
        this.presencesNumber = presencesNumber;
        this.golsNumber = golsNumber;
        this.assistsNumber = assistsNumber;
    }

    public FootballPlayer( String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }


    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPresencesNumber() {
        return presencesNumber;
    }

    public int getGolsNumber() {
        return golsNumber;
    }

    public int getAssistsNumber() {
        return assistsNumber;
    }

    //setters

    public void setPresencesNumber(int presencesNumber) {
        this.presencesNumber = presencesNumber;
    }

    public void setGolsNumber(int golsNumber) {
        this.golsNumber = golsNumber;
    }

    public void setAssistsNumber(int assistsNumber) {
        this.assistsNumber = assistsNumber;
    }


    //methods

    // Calculate how incisive a player is on the field.
    public double score() {
        return (golsNumber + (0.75*assistsNumber))/presencesNumber;
    }
    @Override
    public String toString() {
        return "FootballPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", presencesNumber=" + presencesNumber +
                ", goalsNumber=" + golsNumber +
                ", assistsNumber=" + assistsNumber +
                '}';
    }
}
