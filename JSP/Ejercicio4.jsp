<%-- 
    Document   : Ejercicio4
    Created on : 20-ene-2016, 21:06:25
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio4</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <h1>NOTA MEDIA</h1>
        <form method="post" action="Ejercicio4a.jsp">
            <p>¿Cuál es la nota de tu primer examen?</p>
            <input type="number" name="nota1" step="0.00" min="0" max="10">
            <p>¿Cuál es la nota de tu segundo examen?</p>
            <input type="number" name="nota2" step="0.00" min="0" max="10">
            <p>¿Cuál es la nota de tu tercero examen?</p>
            <input type="number" name="nota3" step="0.00" min="0" max="10">
            <br><br>
            <button type="submit" value="Enviar">Enviar</button>
        </form>
    </body>
</html>
