<%-- 
    Document   : borrarcoche
    Created on : 21-may-2016, 16:41:48
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
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
      Statement s = conexion.createStatement();

      s.execute ("DELETE FROM coche WHERE CodCoche=" + request.getParameter("CodCoche"));
      
      s.close();
    %>	
    <script>document.location = "index.jsp"</script> 
  </body>
</html>
