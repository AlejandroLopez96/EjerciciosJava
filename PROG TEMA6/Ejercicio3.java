/**
 * 
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 *2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Alejandro López Ortiz
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    String Palo = "";
    String Carta = "";
    
    
    System.out.println("Genera al azar una carta:");
    
    int palo = (int)(Math.random()*4) + 1;
      
      switch(palo) {
        case 1:
        Palo = "Bastos";
        break;
        case 2:
        Palo ="Espadas";
        break;
        case 3:
        Palo ="Oros";
        break;
        case 4:
        Palo ="Copas";
        break;
        default:
      }
    
    int carta = (int)(Math.random()*7) + 1;
      
      switch(carta) {
        case 1:
        Carta ="Sota";
        break;
        case 2:
        Carta ="Caballo";
        break;
        case 3:
        Carta ="Rey";
        break;
        case 4:
        Carta ="As";
        break;
        default:
        Carta = String.valueOf(carta);
      }
      System.out.println(Carta + " de " + Palo);
  }
}
      
