package tutorExercises.Ereditarieta.ereditarieta.src.persone;

public class Professore extends Persona {

    private int anniEsperienza;

    public Professore(int anniEsperienza, String nome, String cognome, int eta, String codiceFiscale) {
        super(nome, cognome, eta, codiceFiscale);
        this.anniEsperienza = anniEsperienza;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }
}
