package tutorExercies.footballPlayer;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main {
    //start 14:33

    public static void main(String[] args) {
        FootballPlayer robert = new FootballPlayer("Robert", "Coj");
        FootballPlayer rem = new FootballPlayer("Rem", "Jassi");
        FootballPlayer mary = new FootballPlayer("Mary", "Smith");
        FootballPlayer jane = new FootballPlayer("Jane", "Doe");
        FootballPlayer marco = new FootballPlayer("Marco", "Adriani");

        HashSet<FootballPlayer> stoix = new HashSet<>();
        stoix.add(robert);
        robert.setAssistsNumber(7);
        robert.setGolsNumber(32);
        robert.setPresencesNumber(29);
        stoix.add(rem);
        rem.setAssistsNumber(9);
        rem.setGolsNumber(12);
        rem.setPresencesNumber(25);
        stoix.add(marco);
        marco.setAssistsNumber(12);
        marco.setGolsNumber(33);
        marco.setPresencesNumber(21);

        Team teamA = new Team("Stoix", stoix);



        Team teamB = new Team("Metaphysix");
        teamB.addPlayer(mary);
        teamB.addPlayer(jane);

        Team teamC = new Team("mix", stoix);
        teamC.addPlayer(mary);
        teamC.addPlayer(jane);

        teamC.scoreResult().forEach((player, score) -> {
            if (score > 0.6 ) {
                System.out.println(player.getName() + " : " + score);
            };
        });



    }
}
