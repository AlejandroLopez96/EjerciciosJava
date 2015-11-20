/**
*
*
*
*Escribe un programa que calcule el área de un triánglo.
*
*@author : Alejandro López Ortiz
*
*/
public class Ejercicio6 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Por favor, introduce la medida de la base de tu triángulo en cm: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    System.out.print("Introduce la medida de su altura en cm: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    
    int area;
    area = (base * altura) / 2;
    System.out.print("El área de este triángulo es: " + area);
  }
}  
