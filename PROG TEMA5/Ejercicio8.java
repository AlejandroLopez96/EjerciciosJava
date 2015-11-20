/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alejandro López Ortiz
*/


public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Introduce un número y verás la tabla de multiplicar.");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }

  }
}
