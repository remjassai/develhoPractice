package persone;

import persone.Persona;

public class Studente extends Persona {

    private int matricola;

    public Studente(int matricola, String nome, String cognome, int eta, String codiceFiscale) {
        super(nome, cognome, eta, codiceFiscale);
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void stampaNomeCognome() {
        System.out.println(this.nome);
    }
}
