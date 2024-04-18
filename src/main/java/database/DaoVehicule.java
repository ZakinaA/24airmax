package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Vehicule;
import model.TypeVehicule;

/**
 *
 * @author zakina
 */
public class DaoVehicule {
    
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;
    
    public static ArrayList<Vehicule> getLesVehicules(Connection cnx){
        
        ArrayList<Vehicule> lesVehicules = new ArrayList<Vehicule>();
        try{
            requeteSql = cnx.prepareStatement("select veh_id, veh_immat, veh_dateOrigine, veh_dateRevision, typ_id, typ_nom "             
                    + "from vehicule "
                    + "inner join type_vehicule "
                    + "on typ_id = veh_type_id");
            resultatRequete = requeteSql.executeQuery();
            
            while (resultatRequete.next()){
                
                Vehicule v = new Vehicule();
                    v.setId(resultatRequete.getInt("veh_id"));
                    v.setImmat(resultatRequete.getString("veh_immat"));
                    Date dateOrigine = resultatRequete.getDate("veh_dateOrigine");
                    v.setDateOrigine(dateOrigine.toLocalDate());
                    Date dateRevision = resultatRequete.getDate("veh_dateRevision");
                    v.setDateRevision(dateRevision.toLocalDate());
                    
                    
                    
                TypeVehicule t = new TypeVehicule();
                    t.setId(resultatRequete.getInt("typ_id"));
                    t.setNom(resultatRequete.getString("typ_nom"));
                    
                    v.setUnTypeVehicule(t);
                
                lesVehicules.add(v);
            }
           
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("La requête de getLesVehicules a généré une erreur");
        }
        return lesVehicules;
    }

    public static Vehicule getVehiculeById(Connection cnx, int idVehicule){
        
        Vehicule v = null ;
        try{
            requeteSql = cnx.prepareStatement("select veh_id, veh_immat, veh_dateOrigine, veh_dateRevision, typ_id, typ_nom, typ_caracteristiques" +
                         " from vehicule inner join type_vehicule "+
                         " on veh_type_id = typ_id "+
                         " where veh_id= ? ");
            requeteSql.setInt(1, idVehicule);
            resultatRequete = requeteSql.executeQuery();
            
            if (resultatRequete.next()){
                
                    v = new Vehicule();
                    v.setId(resultatRequete.getInt("veh_id"));
                    v.setImmat(resultatRequete.getString("veh_immat"));
                    Date dateOrigine = resultatRequete.getDate("veh_dateOrigine");
                    v.setDateOrigine(dateOrigine.toLocalDate());
                    Date dateRevision = resultatRequete.getDate("veh_dateRevision");
                    v.setDateRevision(dateRevision.toLocalDate());
                    
                    
                    TypeVehicule t = new TypeVehicule();
                    t.setId(resultatRequete.getInt("typ_id"));
                    t.setNom(resultatRequete.getString("typ_nom"));
                    
                    v.setUnTypeVehicule(t);
   
            }
     
          
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("La requête de getVehiculeById  a généré une erreur");
        }
        return v ;
    }
    
}
