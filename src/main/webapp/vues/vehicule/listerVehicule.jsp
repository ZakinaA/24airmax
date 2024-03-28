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
                ArrayList<Vehicule> lesVehicules = (ArrayList)request.getAttribute("Les Vehicules");
            %>
            <table>  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>immat</th>             
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                        for (Pompier p : lesVehicules)
                        {              
                            out.println("<tr><td>");
                            out.println(p.getId());
                            out.println("</a></td>");

                            out.println("<td><a href ='../ServletVehicule/consulter?idVehicule="+ p.getId()+ "'>");
                            out.println(p.getImmat());
                            out.println("</td>");;
                        }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
    </body>
</html>
