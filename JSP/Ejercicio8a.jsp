<%-- 
    Document   : Ejercicio8a
    Created on : 25-ene-2016, 13:50:56
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio8a</title>
    </head>
    <body>
        <%
         
    int numeroIntroducido = Integer.parseInt(request.getParameter("opcion"));
    for (int i = 0; i <= 10; i++) {
      out.println("<h3>" + numeroIntroducido + " x " + i + " = " + numeroIntroducido * i + "</h3>");
    }
        %>
    </body>
</html>
