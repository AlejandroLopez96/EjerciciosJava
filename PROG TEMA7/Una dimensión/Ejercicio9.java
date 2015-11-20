/**
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números
 *junto con la palabra "par" o "impar" según proceda.
 *
 * @author Alejandro López Ortiz
 */
public class Ejercicio9 {

  public static void main(String[] args) {
  
    int[] numero = new int[8];
    int i;
    
    System.out.println("Introduce 8 números enteros pulsando INTRO después de cada número:");

    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
  }
}
