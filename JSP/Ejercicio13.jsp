<%-- 
    Document   : Ejercicio13
    Created on : 25-ene-2016, 21:48:40
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio13</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <h1>TEST DE INFIDELIDAD</h1>
        <form method="post" action="Ejercicio13a.jsp">
            <b>1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.</b></br>
            <input type="radio" name="p1" value="3"> Verdadero</input></br>
            <input type="radio" name="p1" value="0"> Falso</input></br></br>
            <b>2. Ha aumentado sus gastos de vestuario</b></br>
            <input type="radio" name="p2" value="3"> Verdadero</input></br>
            <input type="radio" name="p2" value="0"> Falso</input></br></br>
            <b>3. Ha perdido el interés que mostraba anteriormente por ti</b><br>
            <input type="radio" name="p3" value="3"> Verdadero</input></br>
            <input type="radio" name="p3" value="0"> Falso</input></br></br>
            <b>4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)</b></br>
            <input type="radio" name="p4" value="3"> Verdadero</input></br>
            <input type="radio" name="p4" value="0"> Falso</input></br></br>
            <b>5. No te deja que mires la agenda de su teléfono móvil</b></br>
            <input type="radio" name="p5" value="3"> Verdadero</input></br>
            <input type="radio" name="p5" value="0"> Falso</input></br></br>
            <b>6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante</b></br>
            <input type="radio" name="p6" value="3"> Verdadero</input></br>
            <input type="radio" name="p6" value="0"> Falso</input></br></br>
            <b>7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a</b></br>
            <input type="radio" name="p7" value="3"> Verdadero</input></br>
            <input type="radio" name="p7" value="0"> Falso</input></br></br>
            <b>8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo</b></br>
            <input type="radio" name="p8" value="3"> Verdadero</input></br>
            <input type="radio" name="p8" value="0"> Falso</input></br></br>
            <b>9. Has notado que últimamente se perfuma más</b></br>
            <input type="radio" name="p9" value="3"> Verdadero</input></br>
            <input type="radio" name="p9" value="0"> Falso</input></br></br>
            <b>10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo</b></br>
            <input type="radio" name="p10" value="3"> Verdadero</input></br>
            <input type="radio" name="p10" value="0"> Falso</input></br></br>
            <input type="submit" value="Resultado">
        </form>
    </body>
</html>
