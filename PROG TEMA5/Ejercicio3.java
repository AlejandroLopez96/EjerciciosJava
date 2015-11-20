/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
 *
 * @author Alejandro López Ortiz
*/


public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Los multiplos de 5 son: ");
    int i = 0;
    do {
      System.out.println(i += 5);
    } while (i < 100);
  }
}
