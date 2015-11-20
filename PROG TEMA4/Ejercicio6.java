/**
 *
 *
 *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura.
 * Aplica la fórmula t =2h/g siendo g = 9.81m/s^2
 *
 *
 *@author : Alejandro López Ortiz
 *
*/

public class Ejercicioformulatiempo {
  public static void main(String[] args) {
    
    System.out.println("Vamos a resolver una ecuación de tiempo. ");
    
    System.out.print("Por favor, introduzca el valor de h: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    
    if (h ==0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("t = " + ((2 * h) / g));
    }
  }
}
