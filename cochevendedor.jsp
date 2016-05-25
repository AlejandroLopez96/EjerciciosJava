<%-- 
    Document   : cochevendedor
    Created on : 22-may-2016, 10:16:03
    Author     : Alex Lopez
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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

        <title>JSP Page</title>
    </head>
    <body>
        <ul>
        <table class="table table-bordered table-striped table-hover table-condensed" style="width: 70px; margin: 0 auto; margin-top:100px;">
            <tr><th style="text-align: center;">Nombre</th><th style="text-align: center;">Apellidos</th><th style="text-align: center;">Ciudad</th><th style="text-align: center;">Telefono</th></tr>
       <% Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery ("SELECT vendedor.Nombre, vendedor.Apellidos,vendedor.Ciudad, vendedor.Telefono FROM vendedor INNER JOIN coche on coche.CodVendedor=vendedor.CodVendedor WHERE CodCoche=" + request.getParameter("CodCoche"));
        while (listado.next()) {
            out.println("<tr><td>" + listado.getString("Nombre") + "</td>");
            out.println("<td>" + listado.getString("Apellidos") + "</td>");
            out.println("<td>" + listado.getString("Ciudad") + "</td>");
            out.println("<td>" + listado.getString("Telefono") + "</td>");
            %>
        </td>
        </tr>
    <%
        }
        conexion.close();
%>
</table>
<br><br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>&nbsp; Volver</button>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
