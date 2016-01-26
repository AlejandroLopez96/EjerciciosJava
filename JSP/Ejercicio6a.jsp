<%-- 
    Document   : Ejercicio6a
    Created on : 25-ene-2016, 12:36:36
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio6a</title>
        <link rel="stylesheet" type="text/css" href="newcss1.css">
    </head>
    <body>
         <%
    double pesetas;
    pesetas = Integer.parseInt(request.getParameter("pesetas"));
    
    double total;
    total = (pesetas * 166.386);
    out.print("El total de Euros es: " + total);
        %>
    </body>
</html>
