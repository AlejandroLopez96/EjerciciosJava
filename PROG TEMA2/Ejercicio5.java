/**
*
*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir
*deberá estar almacenada en una variable.
*
* @author Alejandro López Ortiz
*/

  public class Ejercicio5 { // Clase principal
    public static void main(String[] args) {
      
      
      double cantidad = 3200;
      double resultadoEuro = 0;
      
      System.out.println("Cantidad en Pesetas: 3200 ");
      
      resultadoEuro = cantidad / 166.386;
      
      System.out.println("Valor en Euros: " + resultadoEuro);
 
  }
}
