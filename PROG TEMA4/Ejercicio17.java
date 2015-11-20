/**
 * 
 *Escribe un programa que diga cuál es la última cifra de un número entero introducido por
 *teclado.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/


public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número entero");
    
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.print("El último número introducido es: " + (n % 10));


  }
}
