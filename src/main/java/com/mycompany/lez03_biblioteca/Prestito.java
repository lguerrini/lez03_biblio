/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez03_biblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Prestito {

    private int id_utente;
    private int id_libro;
    private LocalDate data_preso;
    private LocalDate data_reso;

    public Prestito(int id_utente, int id_libro) {
        this.id_utente = id_utente;
        this.id_libro = id_libro;
        data_preso= LocalDate.now();
    }

    
    
    
    public int getId_utente() {
        return id_utente;
    }

    public void setId_utente(int id_utente) {
        this.id_utente = id_utente;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public LocalDate getData_preso() {
        return data_preso;
    }

    public void setData_preso(LocalDate data_preso) {
        this.data_preso = data_preso;
    }

    public LocalDate getData_reso() {
        return data_reso;
    }

    public void setData_reso(LocalDate data_reso) {
        this.data_reso = data_reso;
    }
    
    
    
    

}
