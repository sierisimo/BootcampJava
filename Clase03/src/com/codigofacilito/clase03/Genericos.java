package com.codigofacilito.clase03;

import java.io.BufferedReader;
import java.util.List;
import java.util.Scanner;

public class Genericos {
    static class Cajita<T> {
        private T contenido;

        public Cajita(T contenido){
            this.contenido = contenido;
        }

        public T getContenido() {
            return contenido;
        }

        public void setContenido(T contenido) {
            this.contenido = contenido;
        }
    }

    static class StringCajita extends Cajita<String> {

        public StringCajita(String contenido) {
            super(contenido);
        }
    }

    public static void main(String[] args) {
         Cajita<String> stringCajita = new Cajita<>("Sier");
         Cajita<Integer> integerCajita = new Cajita<>(23);
         Cajita<Scanner> scannerCajita = new Cajita<>(new Scanner(System.in));
         Cajita<Boolean> boleanCajita = new Cajita<>(true);

         Cajita<ChatNotAnswerException> cajitaException = new Cajita<>(new ChatNotAnswerException("sier"));
         Cajita<Colecciones> coleccionesCajita = new Cajita<>(new Colecciones());

         String sierString = stringCajita.getContenido();

         integerCajita.setContenido(45);
         stringCajita.setContenido("Un nuevo string");
    }
}
