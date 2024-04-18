<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Fonction"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SDIS WEB</title>
</head>
<body>
    <%
        Fonction f = (Fonction)request.getAttribute("fFonction");
    %>
    <h1>Bienvenue <%  out.println(f.getPrenom());%>  <%  out.println(f.getNom());%></h1>
    <table>
        <tr>
            <td>Libelle :</td>
            <td><% out.println(f.getLibelle()); %></td>
        </tr>
        <tr>
            <td>Caserne :</td>
            <td><% out.println(f.getUneCaserne().getNom()); %></td>
        </tr>
    </table>
</body>
</html>
