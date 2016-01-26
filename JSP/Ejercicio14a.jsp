<%-- 
    Document   : Ejercicio14a
    Created on : 26-ene-2016, 9:17:57
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio14a</title>
    </head>
    <body>
        <%
            out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
             int n = Integer.parseInt(request.getParameter("num"));
            switch (n) {
              case 1:
                out.print("0");
                break;
              case 2:
                out.print("0 1");
                break;
              default:
                out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;
                while(n > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    out.print(" " + f2);
                    n--;
                }
            }    
            out.println();
    %>
    </body>
</html>
