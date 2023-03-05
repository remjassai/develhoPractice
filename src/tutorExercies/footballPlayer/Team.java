package tutorExercies.footballPlayer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Team {
    //fields
    private static int idCounter = 0;
    private int id;
    private String name;
    private HashSet<FootballPlayer> players;

    //constructor
    public Team(String name) {
        this.name = name;
        this.players = new HashSet<FootballPlayer>();
    }

    public Team(String name, HashSet<FootballPlayer> players) {
        this.name = name;
        this.players = players;
    }

    //Methods

    //print line by line first and last name of each player
    public void printTeam() {
        players.forEach(p -> System.out.println(p.getName() + " " + p.getSurname()));
    }

    public void addPlayer(FootballPlayer player) {
        players.add(player);
    }

    public void printTheBrave(){
        for (FootballPlayer p : this.players) {
            if(p.getGolsNumber()>5 && p.getAssistsNumber()>7 && p.getPresencesNumber()>20){
                System.out.println(
                        p.getName() + " " + p.getSurname()
                );
            }
        }

    }

    public Map<FootballPlayer, Double> scoreResult(){
        Map<FootballPlayer,Double> hm = new HashMap<FootballPlayer, Double>();
        this.players.forEach(p -> {
            hm.put(p, p.score() );
        });
        return hm;
    }

}
