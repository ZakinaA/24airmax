/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author ts1sio
 */


public class Grade {
    
    private int id;
    private String libelle;
    private ArrayList<Grade> lesGrades;
    
    public Grade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Grade(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    public ArrayList<Grade> getLesGrades() {
        return lesGrades;
    }

    public void setLesEleves(ArrayList<Grade> lesGrades) {
        this.lesGrades = lesGrades;
    }
    
    public void addUnEleve(Grade unGrade){
        if (lesGrades == null) {
            lesGrades = new ArrayList<Grade>();
        }
        lesGrades.add(unGrade);
    }
    
}
