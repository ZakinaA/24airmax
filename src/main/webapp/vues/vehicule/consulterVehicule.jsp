<%-- 
    Document   : consulterVehicule
    Created on : 4 avr. 2024, 10:48:25
    Author     : ts1sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Vehicule"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SDIS WEB</title>
    </head>
    <body>
        <%
            Vehicule v = (Vehicule)request.getAttribute("vVehicule");
        %>
        <h1>Bienvenue <%  out.println(p.getPrenom());%>  <%  out.println(p.getNom());%></h1>
        <table>
            <tr>
                <td>Immatriculation : </td><td>immat immat</td>
            </tr>
            <tr>
                <td>Type Vehicule : </td><td><%  out.println(v.getUnTypeVehicule().getNom());%></td>
            </tr>
            <tr>
                <td>Intervention : </td><td><%  out.println(v.getLesInterventions().getId());%></td>
            </tr>
        </table>
    </body>
</html>

