package model;

public class Vehicule {
    private int id;
    private String immat;
    
    public Vehicule(){
        
    }
    
    public Vehicule(int id, String immat){
        this.id=id;
        this.immat=immat;
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
    
}
