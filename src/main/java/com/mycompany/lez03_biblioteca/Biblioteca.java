/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez03_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nome;
    private String comune;
    private String indirizzo;
    private String tel;
    private ArrayList<Libro> elencoLibri;
    private ArrayList<Utente> elencoUtenti;
private ArrayList<Prestito> elencoPrestiti;

    public Biblioteca(String nome, String comune, String indirizzo, String tel) {
        this.nome = nome;
        this.comune = comune;
        this.indirizzo = indirizzo;
        this.tel = tel;
        elencoLibri = new ArrayList<Libro>();
        elencoUtenti = new ArrayList<Utente>();
        elencoPrestiti = new ArrayList<Prestito>();
    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public void setElencoPrestiti(ArrayList<Prestito> elencoPrestiti) {
        this.elencoPrestiti = elencoPrestiti;
    }

    public String getListaLibri() {
        String ris = "";
            int i=0;
        for (Libro l : elencoLibri) {
            i++;
            ris += i+ ") " +l.getId_libro() + ") - " + l.getTitolo() + " - "
                    + l.getAutore() + "\n";
        }

        return ris;
    }

    public int getLastId_libro() {
        int ris = 0;
        // cerco l'ultimo libro
        int pos = elencoLibri.size() - 1;
        if (pos == -1) {
            return 0;
        } else {
            Libro lastlibro = elencoLibri.get(pos);
            ris = lastlibro.getId_libro();
        }
        return ris;
    }

    public int getLastId_utente() {
        if (elencoUtenti.size() == 0) {
            return 0;
        } else {
            return elencoUtenti.get(elencoUtenti.size() - 1).getId_utente();
        }
    }

    public ArrayList<Utente> getElencoUtenti() {
        return elencoUtenti;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public void setElencoLibri(ArrayList<Libro> elencoLibri) {
        this.elencoLibri = elencoLibri;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
