/**
 * Esta clase es una clase sencilla, simple, sin mucha complejidad, su mayor
 * funcion
 * es tener un metodo estatico `static` que sirve para poner algo en pantalla.
 *
 * Por que `static`? Usamos `static` cuando no accedemos a atributos de la clase
 * y
 * queremos una funcion asociada a la clase pero no a sus __"instancias"__.
 *
 * Es decir, para usar esta funcion, la llamaremos de la siguiente manera:
 *
 * `Saludador.diHola();`
 *
 * No es necesario crear objetos para poder invocarla (invocar, significa llamar
 * a la funcion, pedir su ejecucion).
 */
public class Saludador {
  public static void diHola() {
    System.out.println("Hola boocamp de java!!");
  }
}
