/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 *El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 *mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 *ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Alejandro López Ortiz
*/


public class Ejercicio7 {
  public static void main(String[] args) {
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    System.out.println("Intenta acertar el código de la caja fuerte.");
    do {
      System.out.println("Introduce un código de 4 dígitos");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 9612) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Has abierto la caja fuerte, enhorabuena!!");
    } else {
      System.out.println("Lo siento no has podido abrirla");
    }
  }
}
