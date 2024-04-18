
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
        <table>
            <tr>
                <td>Immatriculation : </td><td>immat immat</td>
            </tr>
            <tr>
                <td>Type Vehicule : </td><td><%  out.println(v.getUnTypeVehicule().getNom());%></td>
            </tr>
        </table>
    </body>
</html>

