<%-- 
    Document   : newjsp
    Created on : 25-may-2016, 13:07:58
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
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </head>
    <body>
         <br><br><br>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      String consultaCodCoche = "SELECT * FROM coche WHERE CodCoche="
                                + Integer.valueOf(request.getParameter("CodCoche"));      
      
      ResultSet numeroCoches = s.executeQuery (consultaCodCoche);
      numeroCoches.last();
          String insercion = "UPDATE coche SET " + "Marca='" + (request.getParameter("Marca")) + 
                "',Modelo='" + (request.getParameter("Modelo")) +
                "',Precio='" + Integer.valueOf(request.getParameter("Precio")) +
                "',Provincia='" + (request.getParameter("Provincia")) +
                "',Combustible='" + (request.getParameter("Combustible")) +
                "',Kms='" + Integer.valueOf(request.getParameter("Kms")) + 
                "',Año='" + Integer.valueOf(request.getParameter("Año")) + 
                "',CodVendedor='" + Integer.valueOf(request.getParameter("CodVendedor")) + 
                "' WHERE CodCoche='" +  + Integer.valueOf(request.getParameter("CodCoche")) + "\'";
                s.execute(insercion);
        out.println("Coche modificado correctamente.");
      
      conexion.close();
    %>
    <br><br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>&nbsp; Volver</button>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
</html>
