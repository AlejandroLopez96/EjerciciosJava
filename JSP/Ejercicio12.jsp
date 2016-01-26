<%-- 
    Document   : Ejercicio12
    Created on : 26-ene-2016, 10:47:08
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio12</title>
        <link href="newcss1.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Vamos a generar tu propio calendario!</h1>
    <form method="post" action="Ejercicio12a.jsp">
      Mes
      <select name="mes">
        <option value="1">Enero</option>
        <option value="2">Febrero</option>
        <option value="3">Marzo</option>
        <option value="4">Abril</option>
        <option value="5">Mayo</option>
        <option value="6">Junio</option>
        <option value="7">Julio</option>
        <option value="8">Agosto</option>
        <option value="9">Septiembre</option>
        <option value="10">Octubre</option>
        <option value="11">Noviembre</option>
        <option value="12">Diciembre</option>
      </select> 
      &nbsp;año <input type="number" name="anio" size="4"> 
      &nbsp;<input type="submit" value="Generar">
    </form>
    </body>
</html>
