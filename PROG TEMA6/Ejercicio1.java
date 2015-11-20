/**
 * 
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 *total (los puntos que suman entre los tres dados).
 * 
 * 
 * 
 * @author Alejandro López Ortiz
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    int tirada;
    int suma = 0;
    System.out.println("Tres tiradas de dados al azar");
    for (int i = 1; i <= 3; i++) {
      tirada = ((int)(Math.random()*6 + 1));
      System.out.println(tirada + " ");
      suma += tirada;
    } 
   System.out.println("La suma de los 3 dados es: " + suma); 
  }
}
