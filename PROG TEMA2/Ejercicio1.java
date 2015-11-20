/**
*
* Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
*144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
*la suma, la resta, la división y la multiplicación.
*
* @author Alejandro López Ortiz
*/

public class Ejercicio1 { // Clase principal
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    x = 144;
    y = 999;
    
    int suma = x + y;
    int resta = x - y;
    int división = x/y;
    int multiplicación = x*y;
    
    System.out.println("x = 144 y = 999");
    System.out.println((x + y));
    System.out.println((x-y));
    System.out.println((x/y));
    System.out.println((x*y));
    
    
  }
}
