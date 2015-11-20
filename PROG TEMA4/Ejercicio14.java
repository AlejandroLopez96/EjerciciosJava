/**
 * 
 *Realiza un programa que diga si un número introducido por teclado es par y/o divisible
 *entre 5.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/


public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número");
    
    int n = Integer.parseInt(System.console().readLine());
    if ((n % 2) == 0) {
          System.out.print("Par");
        } else {
          System.out.print("Impar");
        }
    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }


  }
}
