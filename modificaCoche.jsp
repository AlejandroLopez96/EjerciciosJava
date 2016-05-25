<%-- 
    Document   : modificaCoche
    Created on : 21-may-2016, 19:24:36
    Author     : Alex Lopez
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

    <title>Coches Segundamano</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div class="container">
      <br><br>
      <div class="panel panel-info">
        <div class="panel-heading text-center">Modificación Coche</div>
          <form method="get" action="altacochemod.jsp">
            <div class="form-group" display="none"> 
              <label>&nbsp;&nbsp;Código Coche:&nbsp;</label><input type="number" size="5" name="CodCoche" value="<%= request.getParameter("CodCoche") %>" readonly>
            </div>
            <div class="form-group">
            <label>&nbsp;&nbsp;Marca:&nbsp;</label><input type="text" size="20" name="Marca" value="<%= request.getParameter("Marca") %>">
            <label>&nbsp;&nbsp;Modelo:&nbsp;</label><input type="text" size="20" name="Modelo" value="<%= request.getParameter("Modelo") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Precio:&nbsp;</label><input type="number" size="6" name="Precio" value="<%= request.getParameter("Precio") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Provincia:&nbsp;</label><input type="text" name="Provincia" size="20" value="<%= request.getParameter("Provincia") %>">
            </div>
            <div class="form-group"> 
              <label>&nbsp;&nbsp;Combustible:&nbsp;</label><input type="text" size="5" name="Combustible" value="<%= request.getParameter("Combustible") %>">
            </div>
            <div class="form-group">
            <label>&nbsp;&nbsp;Kms:&nbsp;</label><input type="number" size="6" name="Kms" value="<%= request.getParameter("Kms") %>">
            <label>&nbsp;&nbsp;Año:&nbsp;</label><input type="number" size="5" name="Año" value="<%= request.getParameter("Año") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Código Vendedor:&nbsp;</label><%   Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
          Statement s = conexion.createStatement(); 
ResultSet nombres = s.executeQuery ("SELECT CodVendedor,Nombre FROM vendedor");
                out.print("<select name=\"CodVendedor\" style=\"border-radius: 10px 10px 10px 10px;\">");

                while (nombres.next()) {

                 out.print("<option value=\"" + nombres.getString("CodVendedor") +
                   "\" " + "> " + nombres.getString("Nombre") + "</option>");

                }
                out.print("</select>");
              %>
            </div>
            <hr>
            &nbsp;&nbsp;<a href="index.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</a>
            <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>Aceptar</button><br><br>
          </form>

      </div>
      <div class="text-center">&copy; Alejandro López Ortiz</div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
