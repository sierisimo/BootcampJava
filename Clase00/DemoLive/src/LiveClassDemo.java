/**
 * Esta clase cubre un caso similar a `Saludador`, pero existe una diferencia
 * fundamental...
 *
 */
public class LiveClassDemo {
  /**
   *
   * El metodo estatico de esta clase es un metodo "especial" (recordatorio
   * rapido, todas las
   * funciones en Java, son usualmente llamadas "metodos"), tiene una "firma"
   * unica.
   *
   * La "firma" de un metodo esta formada por las siguientes partes:
   *
   * - Modificador de acceso (public en este caso).
   * - Tipo de retorno (void en este caso).
   * - Nombre (es case sensitive, main en este ejemplo).
   * - Parametros (String[] args)
   * - Lista de posibles excepciones (veremos esto en siguientes ejemplos y
   * clases)
   *
   * Este metodo estatico es especial pues es el metodo que sera buscado si
   * tratamos
   * de iniciar una clase desde la terminal (java LiveClassDemo), este metodo sera
   * la manera en que java intentara iniciar todo nuestro programa, cualquier
   * clase
   * que tenga este metodo con esta firma especifica, puede ser el punto de
   * arranque
   * de un programa en Java.
   *
   * En el parametro `args` Java pasara todos los parametros que le demos al
   * programa
   * desde la terminal... Revisa la clase `TerminalExecution` para ver un ejemplo.
   */
  public static void main(String[] args) {
    Saludador.diHola();
  }
}
