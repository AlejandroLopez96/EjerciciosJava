<%-- 
    Document   : index2
    Created on : 23-may-2016, 18:48:37
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
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

    <title>Coches Segundamano</title>
  </head>

  <body style="background-color: #ff6666;">
		<div class="container">
			<br><br>			
      <div class="panel panel-info">
        <div class="panel-heading text-center" ><h2>Coches</h2></div>
        
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
          Statement s = conexion.createStatement(); 
        %>

        <table class="table table-striped table-hover table-condensed" >
        <tr><th>Código</th><th>Marca</th><th>Modelo</th><th>Precio</th><th>Provincia</th><th>Combustible</th><th>Kms</th><th>Año</th><th>VendedorID</th></tr>
        <%
            ResultSet listado = s.executeQuery ("SELECT * FROM coche");
          while (listado.next()) {
            out.println("<tr><td style=\"padding-top:12px;padding-left:35px;\">");
            out.println(listado.getString("CodCoche") + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:35px;\">" + listado.getString("Marca") + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:35px;\">" + listado.getString("Modelo") + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:20px;\">" + listado.getString("Precio") + "€" + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:35px;\">" + listado.getString("Provincia") + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:35px;\">" + listado.getString("Combustible") + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:25px;\">" + listado.getString("Kms") + "km" + "</td>");
            out.println("<td style=\"padding-top:15px;padding-left:25px;\">" + listado.getString("Año") + "</td>");
        %>
        <td>
            <form method="get" action="cochevendedor2.jsp">
            <input type="hidden" name="CodCoche" value="<%=listado.getString("CodCoche") %>"/>
            <button type="submit" class="btn btn-info"  style="border-radius: 20px 20px 20px 20px;margin-top: 5px;"><span class="glyphicon glyphicon-user"></span> Vendedor</button>
            </form>
        </td>
        </tr>
        <%
          } // while   

          conexion.close();
        %>

        </table>
      </div>
        
      <div class="text-center">&copy; Alejandro López Ortiz</div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  </body>
</html>