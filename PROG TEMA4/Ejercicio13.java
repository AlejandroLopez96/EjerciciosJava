/**
 * 
 *Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    
    int aux;
    
    System.out.println("Vamos a visualizar 3 números enteros ordenados de menor a mayor. ");
    
    System.out.print("Por favor, introduzca un número entero: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca otro número entero: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el último número entero: ");
    int c = Integer.parseInt(System.console().readLine());

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");

  }
}


