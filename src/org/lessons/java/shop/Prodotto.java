package org.lessons.java.shop;

public class Prodotto {

    public int codice = (int)(Math.random()* 999999999);
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    /*public Prodotto {String nome, String descrizione, float prezzo, int iva;}{
        this.codice = (int)(Math.random()* 999999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    */

    public String prezzoBase (){
        return "Il prezzo base del prodotto è: " + prezzo + " " + "euro";
    }

    public String prezzoFinale (){
        return String.format("Il prezzo finale del prodotto è: " + ("%.2f"), (prezzo+iva)) + " " + "euro";
    }

    public String nomeEsteso (){
        return "Il codice nome del prodotto è: " + (codice + "-" + nome);
    }

    
    public String prodottoScelto (){
       return "Nome prodotto: " + nome + " " + "Codice prodotto: " + codice + ". " + "Descrizione prodotto: " + "" + descrizione + "." + " " + prezzoBase() + "." + " " + prezzoFinale() + "." + " " + nomeEsteso();
    }
}
