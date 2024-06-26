package servlet;

import database.DaoVehicule;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.util.ArrayList;
import model.TypeVehicule;
import model.Vehicule;
/**
 *
 * @author ts1sio
 */
@WebServlet(name = "ServletVehicule", urlPatterns = {"/ServletVehicule"})
public class ServletVehicule extends HttpServlet {
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
            out.println("<title>Servlet ServletVehicule</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletVehicule at " + request.getContextPath() + "</h1>");
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
       
        // Récup et affichage les eleves 
        if(url.equals("/sdisweb/ServletVehicule/lister"))
        {              
            ArrayList<Vehicule> lesVehicules = DaoVehicule.getLesVehicules(cnx);
            request.setAttribute("vLesVehicules", lesVehicules);
            //System.out.println("lister eleves - nombres d'élèves récupérés" + lesEleves.size() );
           getServletContext().getRequestDispatcher("/vues/vehicule/listerVehicule.jsp").forward(request, response);
        }
         if(url.equals("/sdisweb/ServletVehicule/consulter"))
        {              
           int idVehicule = Integer.parseInt((String)request.getParameter("idVehicule"));
            System.out.println( "vehicule à afficher = " + idVehicule);
            
            Vehicule v = DaoVehicule.getVehiculeById(cnx, idVehicule);
            request.setAttribute("vVehicule", v);
            getServletContext().getRequestDispatcher("/vues/vehicule/consulterVehicule.jsp").forward(request, response);       
           
        }
   
        
         // Récup et affichage des clients interessés par une certaine catégorie de ventes
/*        if(url.equals("/sdisweb/ServletPompier/consulter"))
        {  
            // tout paramètre récupéré de la request Http est de type String
            // Il est donc nécessaire de caster le paramètre idPompier en int
            int idPompier = Integer.parseInt((String)request.getParameter("idPompier"));
            System.out.println( "pompier à afficher = " + idPompier);
            Pompier p= DaoPompier.getPompierById(cnx, idVehicule);
            request.setAttribute("", v);
            getServletContext().getRequestDispatcher("/vues/vehicule/consulterVehicule.jsp").forward(request, response);  
        }*/
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
