/**
*
*
*
*De Mb  a Kb
*
*
*@author : Alejandro López Ortiz
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce la cantidad en Mb: ");
    linea = System.console().readLine();
    double Mb;
    Mb = Double.parseDouble( linea );
    
    double total;
    total = (Mb / 1024);
    System.out.print("El total en Kb es: " + total);
  }
}
