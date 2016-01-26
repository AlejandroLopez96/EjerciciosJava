<%-- 
    Document   : Ejercicio5a
    Created on : 25-ene-2016, 11:51:04
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio5a</title>
        <link rel="stylesheet" type="text/css" href="newcss1.css">
    </head>
    <body>
        <%
    double euros;
    euros = Integer.parseInt(request.getParameter("euros"));
    
    double total;
    total = (euros * 166.386);
    out.print("El total de Pesetas es: " + total);
        %>
    </body>
</html>
