package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    
    public Prodotto(String nome, String descrizione, float prezzo, float iva){
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111111, 999999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    
    
    public String prezzoBase (){
        return String.format("Il prezzo base del prodotto è: " + ("%.2f"), (prezzo)) + " " + "euro";
    }

    public String prezzoFinale (){
        return String.format("Il prezzo finale del prodotto è: " + ("%.2f"), (prezzo + (prezzo * 22 / 100))) + " " + "euro";
    }

    public String nomeEsteso (){
        return "Il codice nome del prodotto è: " + (codice + "-" + nome);
    }

    public String prodottoScelto (){
       return "Nome prodotto: " + nome + " " + "Codice prodotto: " + codice + ". " + "Descrizione prodotto: " + "" + descrizione + "." + " " + prezzoBase() + "." + " " + prezzoFinale() + "." + " " + nomeEsteso();
    }
}
