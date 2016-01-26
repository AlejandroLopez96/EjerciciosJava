<%-- 
    Document   : Ejercicio7a
    Created on : 25-ene-2016, 13:10:49
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    if(request.getParameter("opcion1").equals("opcion1")){
        double euros;
    
    euros = Integer.parseInt(request.getParameter("opcion"));
    
    double total;
    total = (euros * 166.386);
    out.print("El total de Pesetas es: " + total);
    }else{
    double pesetas;
    pesetas = Integer.parseInt(request.getParameter("opcion"));
    
    double total2;
    total2 = (pesetas / 166.386);
    out.print("El total de Euros es: " + total2);
    }
        %>
    </body>
</html>
