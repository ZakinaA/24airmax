<%-- 
    Document   : listerFonction
    Created on : 28 mars 2024, 11:17:13
    Author     : ts1sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Fonction"%>
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
        <h1>Liste des fonctions du Calvados</h1>
            <%
                ArrayList<Fonction> lesFonctions = (ArrayList)request.getAttribute("fLesFonctions");
            %>
            <table>  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>libelle</th>               
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                        for (Fonction f : lesFonctions)
                        {              
                            out.println("<tr><td>");
                            out.println(f.getId());
                            out.println("</a></td>");

                            out.println("<td><a href ='../ServletFonction/consulter?idFonction="+ f.getId()+ "'>");
                            out.println(f.getLibelle());
                            out.println("</td>");;                               
                        }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
    </body>
</html>

