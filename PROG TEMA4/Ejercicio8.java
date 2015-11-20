/**
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
 *notable o sobresaliente).
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Notasboletin {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular la nota media de tus tres examenes. ");
    
    System.out.print("Por favor, introduzca la nota del pimero: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la nota del segundo: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la nota del tercero: ");
    double c = Double.parseDouble(System.console().readLine());
    double media = (a + b + c) / 3;
    System.out.println("Tu nota media es: " + media);

    if (media < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
    }
    
    if (media >= 9) {
      System.out.print("Sobresaliente");
    }
      
  }
}
