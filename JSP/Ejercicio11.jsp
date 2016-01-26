<%-- 
    Document   : Ejercicio11
    Created on : 26-ene-2016, 10:27:00
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio11</title>
         <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <h1>Vamos a generar nuestro propio calendario!</h1>
    <form method="post" action="Ejercicio11a.jsp">
      Mes
      <select name="mes">
        <option>Enero</option>
        <option>Febrero</option>
        <option>Marzo</option>
        <option>Abril</option>
        <option>Mayo</option>
        <option>Junio</option>
        <option>Julio</option>
        <option>Agosto</option>
        <option>Septiembre</option>
        <option>Octubre</option>
        <option>Noviembre</option>
        <option>Diciembre</option>
      </select>
      Año <input type="number" min="1" name="anio"></br></br>
      El día 1 cae en
      <select name="dia1">
        <option value="1">Lunes</option>
        <option value="2">Lartes</option>
        <option value="3">Liércoles</option>
        <option value="4">Jueves</option>
        <option value="5">Viernes</option>
        <option value="6">Sábado</option>
        <option value="7">Domingo</option>
      </select></br></br>
      El mes tiene <input type="number" min="28" max="31" name="diastotales"> días</br></br>
      <hr>
      </br></br>
      <input type="submit" value="Generar">
    </form>
    </body>
</html>
