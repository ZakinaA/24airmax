/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zakina
 */
public class Pompier {
    
    private int id;
    private int bip ;
    private String nom;
    private String prenom ;
    private Caserne uneCaserne ;
    private Vehicule unVehicule;
    private Grade unGrade;
    private Fonction uneFonction;
    private Set<Fonction> fonction = new HashSet<>();
    private ArrayList<Intervention> lesInterventions;

    public Pompier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBip() {
        return bip;
    }
    
    public Set<Fonction> getFonctions() {
        return fonction;
    }
    
    public void setFonctions(Set<Fonction> fonctions) {
        this.fonction = fonction;
    }

    public void setBip(int bip) {
        this.bip = bip;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Caserne getUneCaserne() {
        return uneCaserne;
    }

    public void setUneCaserne(Caserne uneCaserne) {
        this.uneCaserne = uneCaserne;
    }

    public Vehicule getUnVehicule() {
        return unVehicule;
    }

    public void setUnVehicule(Vehicule unVehicule) {
        this.unVehicule = unVehicule;
    }

    public Grade getUnGrade() {
        return unGrade;
    }

    public void setUnGrade(Grade unGrade) {
        this.unGrade = unGrade;
    }

    public Fonction getUneFonction() {
        return uneFonction;
    }

    public void setUneFonction(Fonction uneFonction) {
        this.uneFonction = uneFonction;
    }

    public ArrayList<Intervention> getLesInterventions() {
        return lesInterventions;
    }

    public void setLesInterventions(ArrayList<Intervention> lesInterventions) {
        this.lesInterventions = lesInterventions;
    }
    
    
    
    
    
}
