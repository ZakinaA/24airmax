/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author brian.dupont
 */
public class Intervention {
        
    private int id;
    private String lieu;
    private LocalDate date;
    private LocalTime heureAppel;
    private LocalTime heureArrivee;
    private LocalTime duree;

    public Intervention() {
    }

    public Intervention(int id) {
        this.id = id;
    }

    public Intervention( int id, String lieu, LocalDate date, LocalTime heureAppel, LocalTime heureArrivee, LocalTime duree) {
        this.id = id;
        this.lieu = lieu;
        this.date = date;
        this.heureAppel = heureAppel;
        this.heureArrivee = heureArrivee;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureAppel() {
        return heureAppel;
    }

    public void setHeureAppel(LocalTime heureAppel) {
        this.heureAppel = heureAppel;
    }

    public LocalTime getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(LocalTime heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }
    
    

    
}
