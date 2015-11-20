/**
*
*
*
*Escribe un programa que calcule el total de una factura a partir de la base imponible.
*
*@author : Alejandro López Ortiz
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.println("Por favor, introduce la base imponible de la factura: ");
    double baseimp = Double.parseDouble(System.console().readLine());
    
    
    double total = baseimp + (baseimp * 0.21);
    System.out.println("El total de tu factura es: " + total);
  }
}  
