package model;

import java.time.LocalDate;

public class Vehicule {
    private int id;
    private String immat;
    private LocalDate dateOrigine;
    private LocalDate dateRevision;
    
    public Vehicule(){
        
    }
    
    public Vehicule(int id, String immat, LocalDate dateOrigine, LocalDate dateRevision){
        this.id=id;
        this.immat=immat;
        this.dateOrigine=dateOrigine;
        this.dateRevision=dateRevision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImmat() {
        return immat;
    }

    public void setImmat(String immat) {
        this.immat = immat;
    }

    public LocalDate getDateOrigine() {
        return dateOrigine;
    }

    public void setDateOrigine(LocalDate dateOrigine) {
        this.dateOrigine = dateOrigine;
    }

    public LocalDate getDateRevision() {
        return dateRevision;
    }

    public void setDateRevision(LocalDate dateRevision) {
        this.dateRevision = dateRevision;
    }
    
    
}
