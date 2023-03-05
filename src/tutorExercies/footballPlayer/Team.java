package tutorExercies.footballPlayer;
import java.util.HashSet
public class Team {
    //fields
    private static int idCounter = 0;
    private int id;
    private String name;
    private HashSet<FootballPlayer> squad;

    //constructor
    public Team(String name) {
        this.name = name;
        squad = new HashSet<>();
    }

}
