<%-- 
    Document   : Ejercicio7
    Created on : 25-ene-2016, 12:47:45
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio7</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <h1>Elige la opción que prefieras</h1>
        <form action="Ejercicio7a.jsp">
            Introduce la cantidad  <input type="number" name="opcion"><br><br>
            <input type="radio" name="opcion1" value="opcion1">Cantidad en euros<br><br>
            <input type="radio" name="opcion1" value="opcion2">Cantidad en pesetas<br><br>
            <button type="submit" value="Enviar">Enviar</button>
        </form>
        
    </body>
</html>
