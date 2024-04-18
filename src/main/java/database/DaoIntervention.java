/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Intervention;


public class DaoIntervention {
    
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;
    
    public static ArrayList<Intervention> getLesInterventions(Connection cnx){
        
        ArrayList<Intervention> lesInterventions = new ArrayList<Intervention>();
        try{
            requeteSql = cnx.prepareStatement("select int_id, int_lieu, int_heureAppel, int_heureArrivee, int_duree "             
                    + "from intervention");
            resultatRequete = requeteSql.executeQuery();
            
            while (resultatRequete.next()){
                
                Intervention i = new Intervention();
                    i.setId(resultatRequete.getInt("int_id"));
                    i.setLieu(resultatRequete.getString("int_lieu"));
                    Date dateDate = resultatRequete.getDate("int_date");
                    i.setDate(dateDate.toLocalDate());
                    Time timeHeureAppel = resultatRequete.getTime("int_heureAppel");
                    i.setHeureAppel(timeHeureAppel.toLocalTime());
                    Time timeHeureArrivee = resultatRequete.getTime("int_heureArrivee");
                    i.setHeureArrivee(timeHeureArrivee.toLocalTime());
                    Time timeDuree = resultatRequete.getTime("int_duree");
                    i.setDuree(timeDuree.toLocalTime());
                    
                
                lesInterventions.add(i);
            }
           
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("La requête de getLesInterventions a généré une erreur");
        }
        return lesInterventions;
    }
    
}
