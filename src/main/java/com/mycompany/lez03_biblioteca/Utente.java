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
public class Utente {
    private String cognome;
    private String nome;
    private int id_utente;

    public Utente(int id_utente,String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
        this.id_utente=id_utente;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_utente() {
        return id_utente;
    }
    
}
