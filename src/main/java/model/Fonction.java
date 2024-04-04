/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ts1sio
 */
public class Fonction {
    private int id;
    private String libelle ;
    private String uneFonction ;
    private Set<Pompier> pompier = new HashSet<>();

    public Fonction() {
    }
    
      public Set<Pompier> getPompiers() {
        return pompier;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }
    
        public void setPompiers(Set<Pompier> pompier) {
        this.pompier = pompier;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Fonction(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public String getUneFonction() {
        return uneFonction;
    }

    public void setUneFonction(String uneFonction) {
        this.uneFonction = uneFonction;
    }
    
    
    
}
