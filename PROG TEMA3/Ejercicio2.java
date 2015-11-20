/**
*
*
*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
*se
*
*
*@author : Alejandro López Ortiz
*
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce la cantidad en Euros: ");
    linea = System.console().readLine();
    double euro;
    euro = Integer.parseInt( linea );
    
    double total;
    total = (euro * 166.386);
    System.out.print("El total de Pesetas es: " + total);
  }
}
