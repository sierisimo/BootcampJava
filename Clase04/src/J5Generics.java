import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class J5Generics {
    public static void main(String[] args) {
        J5Helper<String> j5;
        J5Helper<StringBuilder> j55;

        J5Helper<Function<CharSequence, Float>> j54;

        J5Helper<J5Alumno> jAlumno;

        J5Bounded<J5AlumnoGriton> j5Bounded;

//        List<? extends J5Alumno> alumnosLista = new ArrayList<>();
//        alumnosLista.add(new J5AlumnoSilencioso(": "));
//        alumnosLista.add(new J5AlumnoGriton(": "));
    }

    private <T> void genericMethod(T variable) {

    }

    static class MyAlumnoClass {

    }
}

class J5Helper<T> {
    private T t;
}

class J5Bounded<A extends J5Alumno>{
    private A alumno;

    public void sayAlumnoName(){
        System.out.println(alumno.getName());
    }
}

class J5VeryBusy<V1, V2, V3, V4, V5, V6, V7>{

}

class J5Multi<T, A extends J5Alumno, R> {

}

class J5Alumno {
    private String name;

    public J5Alumno(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class J5AlumnoSilencioso extends J5Alumno {
    public J5AlumnoSilencioso(String name) {
        super("...");
    }
}

class J5AlumnoGriton extends J5Alumno {
    public J5AlumnoGriton(String name) {
        super(name.toUpperCase());
    }
}