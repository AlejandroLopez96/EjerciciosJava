/**
 *
 *
 *
 *
 *
 *@author : Alejandro López Ortiz
 *
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a resolver una ecuación de primer grado del tipo ax + b = 0.");
    
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    
    if (a ==0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
  
