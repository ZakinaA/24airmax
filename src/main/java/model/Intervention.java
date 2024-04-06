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
    private String rue;
    private String ville;
    private int copos;
    private LocalDate date;
    private LocalTime heureAppel;
    private LocalTime heureArrivee;
    private LocalTime duree;

    public Intervention() {
    }

    public Intervention(int id) {
        this.id = id;
    }

    public Intervention(String rue) {
        this.rue = rue;
    }

    
}
