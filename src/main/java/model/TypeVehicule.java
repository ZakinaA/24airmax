package model;

public class TypeVehicule {
    private int id;
    private String nom;
    private String carac;
    
    public TypeVehicule(){
        
    }
    
    public TypeVehicule(int id, String nom, String carac){
        this.id=id;
        this.nom=nom;
        this.carac=carac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }
}
