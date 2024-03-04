package com.codigofacilito.clase03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FuncionalYStreams {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Sier", "Federico", "Carlos", "Andres", "Sierisimo","Enrique");
        stringStream.parallel()
                .filter(s -> s.contains("s"))
                .map(s -> s.length())
                .forEach(System.out::println);

        doCoolStuff(x -> x * 2);

        boolean isUrielListed = List.of("Sierisimo", "Uriel").stream().anyMatch(s -> s.contains("Uriel"));
        System.out.println(isUrielListed);

        List.of("Uriel", "@Sierisimo", "Uriel").stream()
                .map(s -> new Colecciones.Alumno(s, null))
                .distinct()
                .forEach(System.out::println);
    }

    @FunctionalInterface
    interface SierLambda {
        // SAM --> Single Abstract Method
        int doCool(int x);
    }

    static void doCoolStuff(SierLambda sierLambda){

    }

    static class SierPredicate implements Predicate<String>{
        @Override
        public boolean test(String s) {
            return s.contains("s");
        }
    }


}
