/*
*
* Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
*
*
*
* @author Alejandro López Ortiz
*/

  public class Ejercicio5 { // Clase principal
    public static void main(String[] args) {
   
      String rojo = "\033[31m";
      String azul = "\033[34m";
      String morado = "\033[35m";	
      String verde = "\033[32m";
      String naranja = "\033[33m";
      String blanco = "\033[37m";

      System.out.println("LUNES\t\tMARTES\t\tMIÉRCOLES\t\tJUEVES\t\tViernes");
      System.out.println(rojo + "FOL\t\t" + azul + "PROG\t\t" + morado + "SIN\t\t\t" + azul + "PROG\t\t" + verde + "BBDD");
      System.out.println(rojo + "FOL\t\t" + azul + "PROG\t\t" + morado + "SIN\t\t\t" + azul + "PROG\t\t" + verde + "BBDD");
      System.out.println(rojo + "FOL\t\t" + azul + "PROG\t\t" + morado + "SIN\t\t\t" + azul + "PROG\t\t" + verde + "BBDD");
      System.out.println(azul + "PROG\t\t" + verde + "BBDD\t\t" + morado + "SIN\t\t\t" + naranja + "ED\t\t" + azul + "PROG");
      System.out.println(naranja + "ED\t\t" + verde + "BBDD\t\t" + blanco + "LM\t\t\t" + blanco + "LM\t\t" + morado + "SIN");
      System.out.println(naranja + "ED\t\t" + verde + "BBDD\t\t" + blanco + "LM\t\t\t" + blanco + "LM\t\t" + morado + "SIN");
  }
}



