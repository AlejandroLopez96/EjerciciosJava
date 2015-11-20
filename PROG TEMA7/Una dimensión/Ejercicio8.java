/**
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
 *año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras
 *del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 *
 * @author Alejandro López Ortiz
 */
public class Ejercicio8 {

  public static void main(String[] args) {
  
    String[] mes = {
      "ene", "feb", "mar", "abr", "may", "jun","jul", "ago", "sep", "oct", "nov", "dic"
    };
                  
    int[] temperatura = new int[12];
    int i;
    int j;
    
          
    for (i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    for (i = 0; i < 12; i++) {
      System.out.printf(mes [i] + "|", mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print("*");
      }
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
}
