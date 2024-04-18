<%-- 
    Document   : consulterPompier
    Created on : 18 mars 2024, 12:03:07
    Author     : zakina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pompier"%>
<%@page import="model.Caserne"%>
<%@page import="model.Vehicule"%>
<%@page import="model.Grade"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SDIS WEB</title>
    </head>
    <body>
        <%
            Pompier p = (Pompier)request.getAttribute("pPompier");
        %>
        <h1><%  out.println(p.getPrenom());%>  <%out.println(p.getNom());%></h1>
        <table>
            <tr>
                <td>Numero Bip : </td><td><%out.println(p.getBip());%></td>
            </tr>
            <tr>
                <td>Caserne : </td><td><%out.println(p.getUneCaserne().getNom());%></td>
            </tr>
            <tr>
                <td>Grade : </td><td><%out.println(p.getUnGrade().getLibelle());%></td>
            </tr>
            <tr>
                <td>Fonction : </td><td><%out.println(p.getUneFonction().getLibelle());%></td>
            </tr>
            <tr>
                <td>Date de naissance : </td><td><%out.println(p.getDateNaissance());%></td>
            </tr>
        </table>
    </body>
</html>
