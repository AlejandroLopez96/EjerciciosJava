/**
 * 
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 *espacios. Muestra también el máximo, el mínimo y la media de esos números.
 * 
 * @author Alejandro López Ortiz
 */
 
public class Ejercicio5 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    
    for (int i = 0; i <= 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.println(n + " ");
      suma += n;
      
      if (n < minimo) {
        minimo = n;
      }
      
      if (n > maximo) {
        maximo = n;
      }
    }
    
    System.out.println("Mínimo: " + minimo + "   Máximo: " + maximo + "   Media: " + suma / 50);
  }
}
