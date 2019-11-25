/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez03_biblioteca;

/**
 *
 * @author tss
 */
public class Libro {
    private int id_libro;
    private String titolo;
    private String autore;
    private String genere;
    private String ubicazione;

    public Libro(int id_libro,String titolo, String autore, String genere, String ubicazione) {
        // attenzione gestire id_libro!!!!
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.ubicazione = ubicazione;
        this.id_libro=id_libro;
    }

    public Libro(int id_libro,String titolo, String autore, String genere) {
         // attenzione gestire id_libro!!!!
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        ubicazione = "---";
        this.id_libro=id_libro;
        
    }

    
    
    
    public int getId_libro() {
        return id_libro;
    }

   
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getUbicazione() {
        return ubicazione;
    }

    public void setUbicazione(String ubicazione) {
        this.ubicazione = ubicazione;
    }
    
    
    
    
    
    
    
}


