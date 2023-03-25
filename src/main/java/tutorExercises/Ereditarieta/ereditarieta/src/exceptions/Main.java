package tutorExercises.Ereditarieta.ereditarieta.src.exceptions;

import java.util.Scanner;

public class Main {

    /* scriviamo un programma che chiede in loop una stringa all'utente
    * e stampa la sua dimensione. Se l'utente inserisce STOP il programma termina,
    * se l'utente inserisce una stringa vuota allora lanciamo l'eccezione StringVuotaException.*/
    public static void main(String[] args) throws EmptyStringException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao benvenuto! Inserisci una stringa");
        String parola = scanner.nextLine();
        try {
            while (parola != "STOP") {
                if (parola == "") {
                    throw new EmptyStringException("Hai inserito una stringa vuota rimbambito");
                }
                System.out.println("La lunghezza della parola è: " + parola.length());
                parola = scanner.nextLine().toUpperCase();
            }
        }
        catch (EmptyStringException e) {
            System.out.println("sto nel catch");
            System.out.println(e.getMessage());
        }

    }

}
