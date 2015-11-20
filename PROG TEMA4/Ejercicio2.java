/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
 * tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
 * a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
 * por teclado.
 *
 *@author : Alejandro López Ortiz
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la hora sin minutos.");
    int hora = Integer.parseInt(System.console().readLine());
      String Frase = "";
      switch (hora) {
        case 6:
          Frase = "Buenos días!";
          break;
        case 7:
          Frase = "Buenos días!";
          break;
        case 8:
          Frase = "Buenos días!";
          break;
        case 9:
          Frase = "Buenos días!";
          break;
        case 10:
          Frase = "Buenos días!";
          break;
        case 11:
          Frase = "Buenos días!";
          break;
        case 12:
          Frase = "Buenos días!";
          break;
        case 13:
          Frase = "Buenas tardes!";
          break;
        case 14:
          Frase = "Buenas tardes!";
          break;
        case 15:
          Frase = "Buenas tardes!";
          break;
        case 16:
          Frase = "Buenas tardes!";
          break;
        case 17:
          Frase = "Buenas tardes!";
          break;
        case 18:
          Frase = "Buenas tardes!";
          break;
        case 19:
          Frase = "Buenas tardes!";
          break;
        case 20:
          Frase = "Buenas tardes!";
          break;
        case 21:
          Frase = "Buenas noches!";
          break;
        case 22:
          Frase = "Buenas noches!";
          break;
        case 23:
          Frase = "Buenas noches!";
          break;
        case 24:
          Frase = "Buenas noches!";
          break;
        case 1:
          Frase = "Buenas noches!";
          break;
        case 2:
          Frase = "Buenas noches!";
          break;
        case 3:
          Frase = "Buenas noches!";
          break;
        case 4:
          Frase = "Buenas noches!";
          break;
        case 5:
          Frase = "Buenas noches!";
          break;
      }
    System.out.println("Hora " + hora + ": " + Frase);
  }
}
  
