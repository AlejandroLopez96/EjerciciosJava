/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Luis José Sánchez
*/


public class Ejemplodowhile2 {
  public static void main(String[] args) {
    int numero;
    String res;
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el número introducido es par
          System.out.println("Qué bonito es el " + numero);
          System.out.println("Quieres seguir? (s o n)");      
          res = System.console().readLine(); 
          if (res.equals("s")) {
            System.out.print("Dime otro número: ");
            numero = Integer.parseInt(System.console().readLine());
              if (numero % 2 == 0) {// comprueba si el número introducido es par
              System.out.println("Qué bonito es el " + numero);
              } else {
              System.out.println("No me gustan los números impares, adiós.");
              }
          }
      } else {
        System.out.println("No me gustan los números impares, adiós.");
      }
    } while (numero % 2 == 0);
  }
}
