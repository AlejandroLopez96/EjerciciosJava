/**
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Vamos a realizar un test, ¡suerte! ");
    
    System.out.println("1 + 1 =  ");
    System.out.println("a: 1  b:2  c:4  d:7 ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("2 + 2 =  ");
    System.out.println("a: 2  b:9  c:5  d:4");
    respuesta = System.console().readLine();  
    if (respuesta.equals("d")) {
      puntos++;
    }

    System.out.println("3 + 4 =  ");
    System.out.println("a:7  b:2  c:4  d:10 ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("3 + 3 =  ");
    System.out.println("a:1  b:2  c:6  d:8");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("9 + 6 =  ");
    System.out.println("a:5  b:15  c:9  d:17 ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("10 + 10 = ");
    System.out.println("a:89  b:14  c:20  d:22");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("20 + 14 = ");
    System.out.println("a:24  b:11  c:34  d:23");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("50 + 50 = ");
    System.out.println("a:100  b:105  c:120  d:135");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5 + 5 =");
    System.out.println("a:2  b:6  c:5  d:10");
    respuesta = System.console().readLine();  
    if (respuesta.equals("d")) {
      puntos++;
    }
    
    System.out.println("6 + 6 =");
    System.out.println("a:13  b:34  c:25  d:12");
    respuesta = System.console().readLine();  
    if (respuesta.equals("d")) {
      puntos++;
    }
    
      System.out.println("Has obtenido: " + puntos + "puntos");
    
  }
}
