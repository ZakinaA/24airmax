package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Fonction; // Import manquant
import model.Pompier;

public class DaoFonction {
    
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;
    
    public static ArrayList<Fonction> getLesFonctions(Connection cnx){
        
        ArrayList<Fonction> lesFonctions= new ArrayList<Fonction>();
        try{
            requeteSql = cnx.prepareStatement("SELECT * FROM fonction");
            resultatRequete = requeteSql.executeQuery();
            
            while (resultatRequete.next()){
                
                Fonction f = new Fonction();
                f.setId(resultatRequete.getInt("id"));
                f.setLibelle(resultatRequete.getString("libelle"));

                lesFonctions.add(f);
            }
           
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("La requête de getLesFonctions a généré une erreur");
        }
        return lesFonctions;
    }
    
    public static Fonction getFonctionById(Connection cnx, int idFonction){
        
        Fonction f = null;
        try{
            requeteSql = cnx.prepareStatement("SELECT fonction.id AS f_id, fonction.libelle AS f_libelle " +
                                              "FROM fonction " +
                                              "WHERE fonction.id = ?");
            requeteSql.setInt(1, idFonction);
            resultatRequete = requeteSql.executeQuery();
            
            if (resultatRequete.next()){
                f = new Fonction();
                f.setId(resultatRequete.getInt("f_id"));
                f.setLibelle(resultatRequete.getString("f_libelle"));
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getFonctionById a généré une erreur");
        }
        
        return f; // Ajout de cette ligne de retour
    }
}
