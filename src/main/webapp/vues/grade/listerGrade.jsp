<%-- 
    Document   : listerGrade
    Created on : 28 mars 2024, 11:15:51
    Author     : ts1sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pompier"%>
<%@page import="model.Caserne"%>
<%@page import="model.Grade"%>
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
                ArrayList<Grade> lesGrades = (ArrayList)request.getAttribute("pLesGrades");
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
                        for (Grade p : lesGrades)
                        {              
                            out.println("<tr><td>");
                            out.println(p.getId());
                            out.println("</a></td>");

                            out.println("<td><a href ='../ServletGrade/consulter?idGrade="+ p.getId()+ "'>");
                            out.println(p.getLibelle());
                            out.println("</td>");;
                        }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
    </body>
</html>
