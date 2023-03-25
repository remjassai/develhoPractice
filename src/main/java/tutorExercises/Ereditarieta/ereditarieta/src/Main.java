package tutorExercises.Ereditarieta.ereditarieta.src;


import tutorExercises.Ereditarieta.ereditarieta.src.persone.Studente;

public class Main {

    public static void main(String[] args) {
        Studente studente = new Studente(1, "Marco", "Adriani", 29, "ABC");
        System.out.println(studente.getMatricola());
    }
}
