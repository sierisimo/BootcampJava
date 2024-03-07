import java.lang.reflect.Constructor;
import java.util.List;

public class Clase05 {
  public static void main(String[] args) {
    System.out.println("Hello Clase 5");

    Alumno sier = new Alumno("Sier", 33);
    doSomething(sier);
    Sesion clase5 = new Sesion(List.of(sier));
  }

  private static void doSomething(Alumno alumno) {
    alumno.sayHi();
  }
}

class Alumno {
  private String name;

  private int age;

  Alumno(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHi() {
    System.out.println("Hola me llamo " + name);
  }
}

class Sesion {
  private List<Alumno> alumnosPresentes;

  Sesion(List<Alumno> alumnos) {
    this.alumnosPresentes = alumnos;
  }
}
