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
public class Bibliotecario {
    String nominativo;
    Biblioteca biblioteca;

    public Bibliotecario(String nominativo, Biblioteca biblioteca) {
        this.nominativo = nominativo;
        this.biblioteca = biblioteca;
    }

    
    public void cambianomeBiblioteca(String nuovonome){
        biblioteca.setNome(nuovonome);
    }
    
    public void addLibro(String autore,String titolo,String genere){
        int id=biblioteca.getLastId_libro()+1;
        Libro lib= new Libro(id, titolo, autore, genere);
        biblioteca.getElencoLibri().add(lib);
        biblioteca.stampaLibriCSV();
    }
    
    public void addUtente(String cognome,String nome){
        int id=biblioteca.getLastId_utente()+1;
        Utente ut= new Utente(id, cognome, nome);
        biblioteca.getElencoUtenti().add(ut);
    }
    
    public void newPrestito (int id_libro, int id_utente){
        Prestito newprestito =new Prestito(id_utente, id_libro);
        biblioteca.getElencoPrestiti().add(newprestito);
    }
    
}
