/**
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * 
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    String horoscopo = "";
    
    System.out.println("¿Cuál es tu horóscopo? ");
    
    System.out.print("Por favor, introduzca el número de mes de tu nacimiento (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el día de tu nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
   
      switch (mes) {
      
      case 1:
      if (dia < 21) {
        horoscopo = "capricornio";
      } else { 
        horoscopo = "acuario";
      }
        break;
      
      case 2:
      if (dia < 21) {
        horoscopo = "acuario";
      } else { 
        horoscopo = "piscis";
      }
        break;
      
      case 3:
      if (dia < 21) {
        horoscopo = "piscis";
      } else { 
        horoscopo = "aries";
      }
        break;
        
      case 4:
      if (dia < 20) {
        horoscopo = "aries";
      } else { 
        horoscopo = "tauro";
      }
        break;
      
      case 5:
      if (dia < 22) {
        horoscopo = "tauro";
      } else { 
        horoscopo = "géminis";
      }
        break;
        
      case 6:
      if (dia < 22) {
        horoscopo = "géminis";
      } else { 
        horoscopo = "cáncer";
      }
        break;
        
      case 7:
      if (dia < 24) {
        horoscopo = "cáncer";
      } else { 
        horoscopo = "leo";
      }
        break;
        
      case 8:
      if (dia < 23) {
        horoscopo = "leo";
      } else { 
        horoscopo = "virgo";
      }
        break;
        
      case 9:
      if (dia < 23) {
        horoscopo = "virgo";
      } else { 
        horoscopo = "libra";
      }
        break;
        
      case 10:
      if (dia < 23) {
        horoscopo = "libra";
      } else { 
        horoscopo = "escorpio";
      }
        break;
        
      case 11:
      if (dia < 21) {
        horoscopo = "escorpio";
      } else { 
        horoscopo = "sagitario";
      }
        break;
      case 12:
      if (dia < 20) {
        horoscopo = "sagitario";
      } else { 
        horoscopo = "capricornio";
      }
        break;
        
      default:
    }    
      System.out.print("Tu horóscopo es " + horoscopo);
    
  }
}
