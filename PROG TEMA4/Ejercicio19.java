/**
 * 
 *Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
 *positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/


public class Ejercicio19 {
  public static void main(String[] args) {
    
    int n, digitos = 0;
    
    System.out.println("Introduce un número entero que tenga como máximo 5 cifras");
    
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    
    if ( n >= 10000 ) {
      digitos = 5;
    }
    
    System.out.println("El número introducido tiene " + digitos + " dígitos.");
  }
}