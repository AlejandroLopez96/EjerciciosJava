<%-- 
    Document   : Ejercicio4a
    Created on : 25-ene-2016, 11:20:33
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="charset=UTF-8">
        <title>Ejercicio4a</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <%
            double nota1 = Double.parseDouble(request.getParameter("nota1"));
            
            double nota2 = Double.parseDouble(request.getParameter("nota2"));
            
            double nota3 = Double.parseDouble(request.getParameter("nota3"));
            
            out.println("Tu nota media es: " + ((nota1 + nota2 + nota3) / 3));
        %>
    </body>
</html>
