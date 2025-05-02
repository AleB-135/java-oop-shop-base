package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();
        prodotto.nome = "Tablet";
        prodotto.descrizione = "Tablet 10 pollici";
        prodotto.prezzo = 109.99f;
        prodotto.iva = 22;

        
        System.out.println(prodotto.codice);
        System.out.println(prodotto.nome);
        System.out.println(prodotto.descrizione);
        System.out.println(prodotto.prezzo);
        System.out.println(prodotto.iva);
        

        System.out.println(prodotto.prodottoScelto());
    }
}
