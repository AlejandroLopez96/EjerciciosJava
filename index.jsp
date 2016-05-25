<%-- 
    Document   : index
    Created on : 21-may-2016, 19:09:59
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
ResultSet nombres = s.executeQuery ("SELECT CodVendedor,Nombre FROM vendedor");
        %>

        <table class="table table-striped table-hover table-condensed" >
        <tr><th>Código</th><th>Marca</th><th>Modelo</th><th>Precio</th><th>Provincia</th><th>Combustible</th><th>Kms</th><th>Año</th><th>VendedorID</th></tr>
        <form method="get" action="altaCoche.jsp">
          <tr><td><input type="number" name="CodCoche"  style="border-radius: 10px 10px 10px 10px;width: 60px;"></td>
              <td><input type="text" name="Marca" size="15"  style="border-radius: 10px 10px 10px 10px;"></td>
              <td><input type="text" name="Modelo" size="15"  style="border-radius: 10px 10px 10px 10px;"></td>
              <td><input type="number" name="Precio" style="border-radius: 10px 10px 10px 10px;width: 60px;"></td>
              <td><input type="text" name="Provincia" size="15"  style="border-radius: 10px 10px 10px 10px;"></td>
              <td><input type="text" name="Combustible" size="10"  style="border-radius: 10px 10px 10px 10px;"></td>
              <td><input type="number" name="Kms"  style="border-radius: 10px 10px 10px 10px;width: 60px; "></td>
              <td><input type="number" name="Año"   style="border-radius: 10px 10px 10px 10px;width: 60px;"></td>
             <td>
              <%                   
                out.print("<select name=\"CodVendedor\" style=\"border-radius: 10px 10px 10px 10px;\">");

                while (nombres.next()) {

                 out.print("<option value=\"" + nombres.getString("CodVendedor") +
                   "\" " + "> " + nombres.getString("Nombre") + "</option>");

                }
                out.print("</select>");
              %>
                </td>
              <td><button type="submit" value="Añadir" class="btn btn-primary"  style="border-radius: 20px 20px 20px 20px;"><span class="glyphicon glyphicon-plus-sign"></span> &nbsp;&nbsp;Añadir&nbsp;&nbsp;</button></td><td></td></tr>           
        </form>
        <%
            ResultSet listado = s.executeQuery ("SELECT * FROM coche");
          while (listado.next()) {
            out.println("<tr><td style=\"padding-top:25px;padding-left:35px;\">");
            out.println(listado.getString("CodCoche") + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:35px;\">" + listado.getString("Marca") + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:35px;\">" + listado.getString("Modelo") + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:20px;\">" + listado.getString("Precio") + "€" + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:35px;\">" + listado.getString("Provincia") + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:35px;\">" + listado.getString("Combustible") + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:25px;\">" + listado.getString("Kms") + "km" + "</td>");
            out.println("<td style=\"padding-top:30px;padding-left:25px;\">" + listado.getString("Año") + "</td>");
        %>
        <td>
            <form method="get" action="cochevendedor.jsp">
            <input type="hidden" name="CodCoche" value="<%=listado.getString("CodCoche") %>"/>
            <button type="submit" class="btn btn-info"  style="border-radius: 20px 20px 20px 20px;margin-top: 17px;"><span class="glyphicon glyphicon-user"></span> Vendedor</button>
            </form>
        </td>
        <td>
        <form method="get" action="modificaCoche.jsp">
          <input type="hidden" name="CodCoche" value="<%=listado.getString("CodCoche") %>">
          <input type="hidden" name="Marca" value="<%=listado.getString("Marca") %>">
          <input type="hidden" name="Modelo" value="<%=listado.getString("Modelo") %>">
          <input type="hidden" name="Precio" value="<%=listado.getString("Precio") %>">
          <input type="hidden" name="Provincia" value="<%=listado.getString("Provincia") %>">
          <input type="hidden" name="Combustible" value="<%=listado.getString("Combustible") %>">
          <input type="hidden" name="Kms" value="<%=listado.getString("Kms") %>">
          <input type="hidden" name="Año" value="<%=listado.getString("Año") %>">
          <input type="hidden" name="CodVendedor" value="<%=listado.getString("CodVendedor") %>">
	  <button type="submit"  class="btn btn-warning"  style="border-radius: 20px 20px 20px 20px;"><span class="glyphicon glyphicon-edit"></span> Modificar</button>
          </form>
          <form method="get" action="borrarcoche.jsp">
          <input type="hidden" name="CodCoche" value="<%=listado.getString("CodCoche") %>"/>
          <button type="submit" class="btn btn-danger"  style="border-radius: 20px 20px 20px 20px;"><span class="glyphicon glyphicon-trash"></span> &nbsp;Eliminar&nbsp;</button>
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