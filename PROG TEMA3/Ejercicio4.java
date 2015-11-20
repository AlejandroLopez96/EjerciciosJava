/**
*
*
*Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
*teclado.
*
*@author : Alejandro López Ortiz
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int suma;
    suma = (primerNumero + segundoNumero);
    System.out.println("El resultado de su suma es: " + suma);
    
    int resta;
    resta = (primerNumero - segundoNumero);
    System.out.println("El resultado de su resta es: " + resta);
    
    int multi;
    multi = (primerNumero * segundoNumero);
    System.out.println("El resultado de su multiplicación es: " + multi);
    
    int divi;
    divi = (primerNumero / segundoNumero);
    System.out.println("El resultado de su división es: " + resta);
    
  }
}  
