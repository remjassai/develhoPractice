package Challenges.catalogoNegozio;

public interface Discount {

//    double getDiscount();
    // applicaSconto: un metodo che applica uno sconto al prodotto.
    // Lo sconto deve essere espresso in percentuale (ad esempio, uno sconto del 10% deve essere passato
    //  come 10,0).
    void applyDiscount(/*Product p, */double discount);

    // calcolaPrezzoScontato(): un metodo che a partire dal prezzo del prodotto e dallo

    //  sconto impostato, calcola il prezzo effettivo.
    double calculateDiscountPrice();


}
