/**
 * 
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejernotamediatresnotas {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular la nota media de tus tres examenes. ");
    
    System.out.print("Por favor, introduzca la nota del pimero: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la nota del segundo: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la nota del tercero: ");
    double c = Double.parseDouble(System.console().readLine());
    
    System.out.println("Tu nota media es: " + ((a + b + c) / 3));
  }
}
