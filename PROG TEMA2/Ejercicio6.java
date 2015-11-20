/**
*Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
*sin IVA). La base imponible estará almacenada en una variable.
* @author : Alejandro López Ortiz
*/
  public class Ejercicio6 {
  public static void main(String[] args) {
  
    double baseimponible = 32;
    double totalfactura = 0;
    
    System.out.println("Factura sin IVA: 32 ");
    
    totalfactura = baseimponible + (baseimponible * 0.21);
    
    System.out.println("Total de la factura:  " + totalfactura);
  }
}
