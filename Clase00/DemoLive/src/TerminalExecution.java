/**
 * TerminalExecution
 */
public class TerminalExecution {

  public static void main(String[] args) {
    /*
     * Ten cuidado al acceder a los argumentos de la terminal, podria ser que
     * no tengas todos los argumentos que esperas tener.
     *
     * Puedes compilar el programa:
     *
     * `javac TerminalExecution.java`
     *
     * Y ejecutarlo:
     *
     * `java TerminalExecution param1 param2 param3 ...`
     *
     * sustiuyendo paramX por cualquier cosa que quieras, considera que java va a
     * separar
     * todos los argumentos tan pronto encuentre un espacio, si quieres pasar algo
     * con espacio
     * debes usar comillas: "este seria el argumento completo"
     */
    for (int i = 0; i < args.length; i++) {
      System.out.println("Argumento " + (i + 1) + " recibido: " + args[i]);
    }
  }
}
