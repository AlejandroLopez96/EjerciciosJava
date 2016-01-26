<%-- 
    Document   : Ejercicio11a
    Created on : 26-ene-2016, 10:27:10
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio11a</title>
        <link href="newcss1.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1><% out.print(request.getParameter("mes") + " " + request.getParameter("anio"));%></h1>
    <%
      int columna = 1;
      int diasTotales = Integer.parseInt(request.getParameter("diastotales"));
      int dia1 = Integer.parseInt(request.getParameter("dia1"));
    %>
    <table style="background-color: white; border-collapse: collapse; box-shadow: #242424 4px 4px 4px">
      <tr><th>L</th><th>M</th><th>X</th><th>J</th><th>V</th><th>S</th><th>D</th></tr>
      <tr>
      <%
      for (int i = 1; i < diasTotales + dia1; i++) {
        if (i >= dia1) {
          out.print("<td>" + (i - dia1 + 1) + "</td>");
        } else {
          out.print("<td> </td>"); // las primeras celdas quedan vacías
        }
        columna++;
        if (columna == 8) { // salta a la siguiente columna
          out.println("</tr><tr>");
          columna = 1;
        }
      }
      %>
      </td></tr>
    </table>
    </form>
    </body>
</html>
