/**
*
*
*
*Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 π2 h
*
*@author : Alejandro López Ortiz
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Por favor, introduce la medida del radio de la base del cono en cm: ");
    double radio;
    radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la medida de su altura en cm: ");
    double altura;
    altura = Double.parseDouble(System.console().readLine());
    
    double vol;
    vol = (0.33 * 3.14 * radio * radio * altura);
    System.out.print("El volumen del cono es: " + vol);
  }
}  
