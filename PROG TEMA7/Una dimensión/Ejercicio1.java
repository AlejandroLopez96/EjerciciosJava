/**
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
 *que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
 *sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Alejandro López Ortiz
 */

public class Ejercicio1 {

  public static void main(String[] args) {
    
    int[] x = new int[12];
      x[0] = 39;
      x[1] = -2;
      x[4] = 0;
      x[6] = 14;
      x[8] = 5;
      x[9] = 120;
    
    System.out.println("El array caracter contiene los siguientes elementos:");
    
    for (int i = 0; i < 12; i++) {
      System.out.println(x[i]);
    }
  }
}
