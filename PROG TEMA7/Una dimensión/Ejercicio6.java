/**
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 *elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
 *el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 *posición 0. Finalmente, muestra el contenido del array.
 *
 * @author Alejandro López Ortiz
 */
public class Ejercicio6 {

  public static void main(String[] args) {
    
      int[] numero = new int[15];
      int i;
      
      System.out.println("Introduce números enteros pulsando INTRO en cada uno:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = Integer.parseInt(System.console().readLine());
      }
      
      System.out.println();
      
      System.out.println("Array original:");
      for (i = 0; i < 15; i++) {
        System.out.print(numero[i] + " ");
      }
      
      System.out.println("\nArray rotado a la derecha una posición:");
      int n = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = n;
      
      for (i = 0; i < 15; i++) {
        System.out.print(numero[i] + " ");
      }
  }
}
