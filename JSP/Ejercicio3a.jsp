<%-- 
    Document   : Ejercicio3a
    Created on : 19-ene-2016, 20:52:01
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio3Frase</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    Hola 
    <% out.print(request.getParameter("nombre"));%>
  </body>
</html>