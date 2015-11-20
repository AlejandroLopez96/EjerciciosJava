/**
 *
 *
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 *del día de la semana.
 *
 *
 *@author : Alejandro López Ortiz
 *
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de un dia de la semana: ");
    int numdia = Integer.parseInt(System.console().readLine());
    String dia = "";
      switch (numdia) {
        case 1:
          dia = "Lunes";
          break;
        case 2:
          dia = "Martes";
          break;
        case 3:
          dia = "Miércoles";
          break;
        case 4:
          dia = "Jueves";
          break;
        case 5:
          dia = "Viernes";
          break;
        case 6:
          dia = "Sábado";
          break;
        case 7:
          dia = "Domingo";
          break;
      }

    System.out.println("Este día es: " + dia);
  
  }
}
