/**
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while .
 *
 * @author Alejandro López Ortiz
*/


public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Números del 320 al 160, contando de 20 en 20 hacia atrás: ")
    int i = 340;
    do {
      System.out.println(i -= 20);
    } while (i > 160);
  }
}
