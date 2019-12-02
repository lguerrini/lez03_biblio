/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez03_biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class Biblioteca {

    final String FILE_TXT = "elencolibri.txt";
    final String FILE_CSV = "elencolibri.csv";
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
        int i = 0;
        for (Libro l : elencoLibri) {
            i++;
            ris += i + ") cod:" + l.getId_libro() + " - " + l.getTitolo() + " - "
                    + l.getAutore() + "\n";
        }

        return ris;
    }

    public String getListaLibriCSV() {
        String ris = "";
        for (Libro l : elencoLibri) {

            ris += l.getId_libro() + ";" + l.getTitolo() + ";"
                    + l.getAutore() + "\n";
        }

        return ris;
    }

    public int getLastId_libro() {
        int ris = 0;
        // cerco l'ultimo libro
        int pos = elencoLibri.size();
        if (pos == 0) {
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

    void stampaLibri() {
        FileWriter myWriter = null;
        try {
            String strLista = getListaLibri();
            myWriter = new FileWriter(FILE_TXT);
            myWriter.write(strLista);
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    String readFileTXT() {
        String ris = "";
        try {
            File myObj = new File(FILE_TXT);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                ris += myReader.nextLine() +"\n";
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");

        }

        return ris;
    }

    void stampaLibriCSV() {
        FileWriter myWriter = null;
        try {
            String strLista = getListaLibriCSV();
            myWriter = new FileWriter(FILE_CSV);
            myWriter.write(strLista);
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void readAddLibroCSV() {
        try {
            File myObj = new File(FILE_CSV);
            Scanner myReader = new Scanner(myObj);
            //rimuovo l'elenco libri e lo aggiorno con i dati su DB
            elencoLibri.clear();
            while (myReader.hasNextLine()) {
                //leggo una riga per volta campi separati da ;
                String riga=myReader.nextLine();
                String fields[] =riga.split(";");
                //preparo i dati per creare il  libro
                int id_libro=Integer.parseInt(fields[0]);
                String titolo =fields[1];
                String autore =fields[2];
                String genere="NN";
                //creo il libro
                Libro newlib = new Libro(id_libro,titolo,autore,genere);
                //lo aggiungo all'elenco
                elencoLibri.add(newlib);
                
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");

        }

   


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
