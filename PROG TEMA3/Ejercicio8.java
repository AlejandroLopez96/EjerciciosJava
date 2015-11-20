/**
*
*
*
*Escribe un programa que calcule el salario semanal de un empleado en base a las horas
*trabajadas, a razón de 12 euros la hora.
*
*@author : Alejandro López Ortiz
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    
    int sueldo;
    
    System.out.println("Por favor, introduce las horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas < 40) {
      sueldo = 12 * horas;
    } else {
      sueldo = (40 * 12) + ((horas - 40) * 16);    
    }
    System.out.println("Tu salario semanal es de: " + sueldo + "€");
  }
}  
