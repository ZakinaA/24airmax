/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import database.DaoCaserne;
import database.DaoFonction;
import database.DaoPompier;
import form.FormPompier;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.util.ArrayList;
import model.Caserne;
import model.Fonction;
import model.Pompier;

/**
 *
 * @author zakina
 */
public class ServletFonction extends HttpServlet {

     Connection cnx ;
            
    @Override
    public void init()
    {     
        ServletContext servletContext=getServletContext();
        cnx = (Connection)servletContext.getAttribute("connection");     
    }

    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFonction</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletFonction at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String url = request.getRequestURI();

    if (url.equals("/sdisweb/ServletFonction/lister")) {
        // Traitement pour lister les fonctions
        ArrayList<Fonction> lesFonctions = DaoFonction.getLesFonctions(cnx);
        request.setAttribute("fLesFonctions", lesFonctions);
        getServletContext().getRequestDispatcher("/vues/fonction/listerFonction.jsp").forward(request, response);
    } else if (url.equals("/sdisweb/ServletFonction/consulter")) {
        // Traitement pour consulter une fonction
        int idFonction = Integer.parseInt(request.getParameter("idFonction"));
        System.out.println("Fonction à afficher = " + idFonction);
        Fonction f = DaoFonction.getFonctionById(cnx, idFonction);
        request.setAttribute("pFonction", f);
        getServletContext().getRequestDispatcher("/vues/fonction/consulterfonction.jsp").forward(request, response);
    } else if (url.equals("/sdisweb/ServletFonction/ajouter")) {
        // Traitement pour ajouter une fonction
        ArrayList<Caserne> lesCasernes = DaoCaserne.getLesCasernes(cnx);
        request.setAttribute("pLesCasernes", lesCasernes);
        getServletContext().getRequestDispatcher("/vues/pompier/ajouterPompier.jsp").forward(request, response);
    }
}

        
        /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        

          
        
    
   }


