/**
 *
 * 
 *Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
 *infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
 *Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con
 *falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas
 *y las conclusiones del programa.
 * 
 * @author : Alejandro López Ortiz
 * 
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Vamos a realizar un test para ver la probabilidad de que tu pareja te esté siendo infiel. La respuesta será Verdadero (V) o Falso (F).");
    
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }

    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }

    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("Verdadero  Falso");
    respuesta = System.console().readLine();  
    if (respuesta.equals("Verdadero")) {
      puntos = puntos + 3;
    }

    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("Has notado que últimamente se perfuma más");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("V  F");
    respuesta = System.console().readLine();  
    if (respuesta.equals("V")) {
      puntos = puntos + 3;
    }
    
    System.out.println("Has obtenido: " + puntos + "puntos");
      
    if (puntos <= 10) {
      System.out.print("Enhorabuena! tu pareja parece ser totalmente fiel."); 
    }
    
    if ((puntos > 11) && (puntos <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    
    if ((puntos > 22) && (puntos <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    

    
  }
}
