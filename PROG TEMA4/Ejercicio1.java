/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 *toca a primera hora ese día.
 *
 * @author Alejandro López Ortiz
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de un dia de la semana y te diré lo que toca a  primera hora: ");
    String dia = System.console().readLine();
    String Asignatura = "";
      switch (dia) {
        case "lunes":
          Asignatura = "FOL";
          break;
        case "martes":
          Asignatura = "PROG";
          break;
        case "miercoles":
          Asignatura = "SIN";
          break;
        case "jueves":
          Asignatura = "PROG";
          break;
        case "viernes":
          Asignatura = "BBDD";
          break;
      default:
          Asignatura = "No hay clase.";
      }

    System.out.println("Este día: " + Asignatura);
  
  }
}
