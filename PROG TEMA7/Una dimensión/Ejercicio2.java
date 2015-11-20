/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
 *según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
 *del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Alejandro López Ortiz
 */

public class Ejercicio2 {

  public static void main(String[] args) {
        
    char[] símbolo = new char[10];
                
    símbolo[0] = 'a';
    símbolo[1] = 'x';
    símbolo[4] = '@';
    símbolo[6] = ' ';
    símbolo[7] = '+';
    símbolo[8] = 'Q';
    
    System.out.println("El array símbolo contiene los siguientes elementos:");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(símbolo[i]);
    }
  }
}
