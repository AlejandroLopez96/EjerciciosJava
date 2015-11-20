/**
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * @author Alejandro López Ortiz
*/

public class ejercicio9 {
  public static void main(String[] args) {
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduce un número y sabrás cuantos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}

