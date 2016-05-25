<%-- 
    Document   : login
    Created on : 23-may-2016, 23:50:16
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
        <% Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches","root", "");
        Statement s = conexion.createStatement();
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        String consulta = "SELECT * FROM login WHERE Usuario = " + "\'" + usuario + "\' " + "AND " + "Clave= " + "\'" + clave + "\'";   
        ResultSet listadoAcceso = s.executeQuery(consulta); 
        listadoAcceso.next();
        int cuentaFilas = listadoAcceso.getRow();
        if (cuentaFilas == 1) { %>
        <script>document.location = "index.jsp"</script>
        <% 
        }else{ 
        %>
        <script>document.location = "errorlogin.jsp"</script> 
        
        <%   
        } 
        %>   
    </body>
</html>
