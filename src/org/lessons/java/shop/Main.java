package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto_1 = new Prodotto("Tablet", "Tablet 10 pollici", 109.99f, 22f);

        /* 
        prodotto_1.nome = "Tablet";
        prodotto_1.descrizione = "Tablet 10 pollici";
        prodotto_1.prezzo = 109.99f;
        prodotto_1.iva = 22f;
        */

        System.out.println(prodotto_1.codice);
        System.out.println(prodotto_1.nome);
        System.out.println(prodotto_1.descrizione);
        System.out.println(prodotto_1.prezzo);
        System.out.println(prodotto_1.iva);
        

        System.out.println(prodotto_1.prodottoScelto());

        
        Prodotto prodotto_2 = new Prodotto("Pc gaming", "BREUNOR AGARES - Pc gaming i9", 3599.99f, 22f);

        /* 
        prodotto_2.nome = "Pc gaming";
        prodotto_2.descrizione = "BREUNOR AGARES - Pc gaming i9";
        prodotto_2.prezzo = 3599.99f;
        prodotto_2.iva = 22f;
        */

        System.out.println(prodotto_2.codice);
        System.out.println(prodotto_2.nome);
        System.out.println(prodotto_2.descrizione);
        System.out.println(prodotto_2.prezzo);
        System.out.println(prodotto_2.iva);
        

        System.out.println(prodotto_2.prodottoScelto());

        Prodotto prodotto_3 = new Prodotto("Sedia gaming", "AutoFull C3 Sedia Gaming", 249.99f, 22f);

        /* 
        prodotto_3.nome = "Sedia gaming";
        prodotto_3.descrizione = "AutoFull C3 Sedia Gaming";
        prodotto_3.prezzo = 249.99f;
        prodotto_3.iva = 22f;
        */

        System.out.println(prodotto_3.codice);
        System.out.println(prodotto_3.nome);
        System.out.println(prodotto_3.descrizione);
        System.out.println(prodotto_3.prezzo);
        System.out.println(prodotto_3.iva);
        

        System.out.println(prodotto_3.prodottoScelto());
    }
}
