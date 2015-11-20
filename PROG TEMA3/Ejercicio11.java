/**
*
*
* De Kb a Mb
*
*@author : Alejandro López Ortiz
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce la cantidad en Kb: ");
    linea = System.console().readLine();
    double Kb;
    Kb = Double.parseDouble( linea );
    
    double total;
    total = (Kb * 1024);
    System.out.print("El total en Mb es: " + total);
  }
}
