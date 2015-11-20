/**
*
*
*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
*debe ser introducida por teclado.
*
*@author : Alejandro López Ortiz
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce la cantidad en Pesetas: ");
    linea = System.console().readLine();
    double pesetas;
    pesetas = Integer.parseInt( linea );
    
    double total;
    total = (pesetas / 166.386);
    System.out.print("El total en Euros es: " + total);
  }
}
