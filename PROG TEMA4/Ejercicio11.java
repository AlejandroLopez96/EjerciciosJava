/**
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 *segundos que faltan para llegar a la medianoche.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular los segundos que quedan hasta medianoche. ");
    System.out.println("Primero introducirá la hora y luego los minutos.");
    
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca los minutos: ");
    int min = Integer.parseInt(System.console().readLine());
    
    int segtrans = (hora * 3600) + (min * 60);
    int segmn = (24 * 3600) - segtrans;
    
    System.out.println("Los segundos que quedan hasta medianoche son: " + hora + min + segmn);

      
  }
}

