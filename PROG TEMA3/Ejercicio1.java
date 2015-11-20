/**
*
*
*Realiza un programa que pida dos números y que luego muestre el resultado de su
*multiplicación.
* 
*@author : Alejandro López Ortiz
*/
public class Ejercicio1 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = (primerNumero * segundoNumero);
    System.out.print("El resultado de su multiplicación es: " + total);
  }
}  
