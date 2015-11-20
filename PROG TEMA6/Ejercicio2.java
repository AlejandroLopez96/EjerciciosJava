/**
 * 
 *Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
 *baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
 *formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
 *9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
 *podemos usar String.valueOf(n) .
 * 
 * @author Alejandro López Ortiz
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
    String Palo = "";
    String Carta = "";
    
    
    System.out.println("Genera al azar una carta:");
    
    int palo = (int)(Math.random()*4) + 1;
      
      switch(palo) {
        case 1:
        Palo = "Picas";
        break;
        case 2:
        Palo ="Corazones";
        break;
        case 3:
        Palo ="Diamantes";
        break;
        case 4:
        Palo ="Tréboles";
        break;
        default:
      }
    
    int carta = (int)(Math.random()*13) + 1;
      
      switch(carta) {
        case 1:
        Carta ="J";
        break;
        case 2:
        Carta ="Q";
        break;
        case 3:
        Carta ="K";
        break;
        case 4:
        Carta ="A";
        break;
        default:
        Carta = String.valueOf(carta);
      }
      System.out.println(Carta + " de " + Palo);
  }
}
      
