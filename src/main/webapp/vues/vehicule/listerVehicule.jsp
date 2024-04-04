<%-- 
    Document   : listerVehicule
    Created on : 28 mars 2024, 11:15:55
    Author     : ts1sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Vehicule"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SDIS WEB</title>
    </head>
    <body>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APPLICATION DE GESTION SDIS CALVADOS</title>
    </head>
    <body>
        <h1>Liste des pompiers du Calvados</h1>
            <%
                ArrayList<Vehicule> lesVehicules = (ArrayList)request.getAttribute("vLesVehicules");
            %>
            <table>  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>immat</th>
                    <th>date Origine</th>
                    <th>date Revision</th>
                    <th>type</th>

                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                        for (Vehicule v : lesVehicules)
                        {              
                            out.println("<tr><td>");
                            out.println(v.getId());
                            out.println("</a></td>");

                            out.println("<td><a href ='../ServletVehicule/consulter?idVehicule="+ v.getId()+ "'>");
                            out.println(v.getImmat());
                            out.println("</td>");;
                            
                            out.println("<td>");
                            out.println(v.getDateOrigine());
                            out.println("</td>");
                            
                            out.println("<td>");
                            out.println(v.getDateRevision());
                            out.println("</td>");
                            
                            out.println("<td>");
                            out.println(v.getUnTypeVehicule().getNom());
                            out.println("</td></tr>");
                        }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
    </body>
</html>
