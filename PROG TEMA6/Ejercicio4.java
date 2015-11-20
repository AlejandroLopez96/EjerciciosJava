/**
 * 
 *Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
 *espacios.
 * 
 * @author Alejandro López Ortiz
 */
 
public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("20 números enteros aleatorios entre 0 y 10 (ambos incluidos):");
    
      for (int i = 0; i <= 20; i++) {
      System.out.print( (int)(Math.random()*11) + " ");
      }
      
      System.out.println();
  }
}
