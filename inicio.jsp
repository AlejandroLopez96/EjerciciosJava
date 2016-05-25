<%-- 
    Document   : iniciocompvend
    Created on : 23-may-2016, 18:01:52
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="formulario.css">
        <title>JSP Page</title>
    </head>
    <body>
       <div id="envoltura">
            <div id="mensaje">Mensaje...</div>
            <div id="contenedor" class="curva">
                <div id="cabecera" class="tac">
                        <img src="coche.jpg" />
                </div>
                <div id="cuerpo">
                    <form action="index2.jsp"><input name="submit" type="submit" id="submit" value="Ingresar como COMPRADOR" class="boton"/></form>
                    <div class="a">
                    <h1 style="text-align:center;">LOGIN Vendedor</h1>
                    </div>
                    
                <form id="form-login" action="login.jsp" method="post" autocomplete="off">
                <p>Usuario:</p>
                <p class="mb10"><input size="34" name="usuario" type="text" autofocus required /></p>
                <p>Contraseña:</p>
                <p class="mb10"><input size="34" name="clave" type="password" required /></p>
                <p><input action="login.jsp" name="submit" type="submit" id="submit" value="Ingresar" class="boton" style="margin-left: 95px;"/></p>
                </form>
                </div>
                <div id="pie" class="tac">Venta de Coches de Segundamano</div>
            </div>
        </div>
    </body>
</html>
