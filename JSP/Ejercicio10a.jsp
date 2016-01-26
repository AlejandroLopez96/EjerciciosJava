<%-- 
    Document   : Ejercicio10a
    Created on : 26-ene-2016, 9:38:56
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio10a</title>
        <link rel="stylesheet" type="text/css" href="newcss1.css">
    </head>
    <body>
        Ha obtenido
      <%
        int puntos = 0;

        for (Integer i = 1; i < 11; i++) {
          puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
        }

        out.print(puntos + " puntos.");
      %>
    </body>
</html>
