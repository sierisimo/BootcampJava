package com.codigofacilito.clase03;

import java.util.*;

// bigocheatsheet.com
public class Colecciones {
    static class CodigoFacilitoList implements List<String> {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(String s) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends String> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends String> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public String get(int i) {
            return null;
        }

        @Override
        public String set(int i, String s) {
            return null;
        }

        @Override
        public void add(int i, String s) {

        }

        @Override
        public String remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<String> listIterator() {
            return null;
        }

        @Override
        public ListIterator<String> listIterator(int i) {
            return null;
        }

        @Override
        public List<String> subList(int i, int i1) {
            return null;
        }
    }

    public static class Alumno {
        private String name;
        private String email;


        public Alumno(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Alumno alumno = (Alumno) o;
            return Objects.equals(name, alumno.name) && Objects.equals(email, alumno.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email);
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    static class ListAlumno extends LinkedList<Alumno>{

    }

    private List<Long> list = new LinkedList<>();

    private static void listas(){
        List<String> stringList = new ArrayList<>();
        List<Number> numberList = new LinkedList<>();

        stringList.add("Sier");

        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        numberList.add(3);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);
        numberList.add(3);
        numberList.remove(2);

        System.out.println(numberList);
    }

    private static void sets(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Juan Carlos");
        stringSet.add("Uriel");
        stringSet.add("Sier");
        stringSet.add("Juan Carlos");

        System.out.println(stringSet);

        Set<Alumno> claseAlargada = new LinkedHashSet<>();
        claseAlargada.add(new Alumno("Miguel A Soto", "miguelasoto@codigofacilito.com"));
        claseAlargada.add(new Alumno("Miguel A Soto", "miguelasoto@codigofacilito.com"));
        claseAlargada.add(new Alumno("Miguel A Soto", "miguelasoto@codigofacilito.com"));

        claseAlargada.add(new Alumno("Clark", "clark@codigofacilito.com"));


        claseAlargada.add(new Alumno("Miguel A Soto", "miguel.a.soto@codigofacilito.com"));
        claseAlargada.add(new Alumno("Miguel A Soto", "miguelasoto@codigofacilito.com"));
        claseAlargada.add(new Alumno("Miguel A Soto", "miguelasoto@codigofacilito.com"));

        System.out.println(claseAlargada);
    }

    private static void maps(){
        Map<String, Integer> agesMap = new HashMap<>();
        agesMap.put("Sier", 33);
        agesMap.put("Uriel", 23);

        System.out.println(agesMap.get("Sier"));
        System.out.println(agesMap.get("Ada"));

        ListAlumno alumnos = new ListAlumno();
        alumnos.addAll(List.of(new Alumno("Federico", null), new Alumno("Enrique", null)));

        Map<ListAlumno, Set<List<Double>>> alumnosConCalificacionesPorSemestre = new HashMap<>();
        alumnosConCalificacionesPorSemestre.put(
                alumnos,
                        Set.of(
                                List.of(8.5, 9.1), List.of(9.1, 7.2)
                        )
        );

        System.out.println(alumnosConCalificacionesPorSemestre);
    }

    public static void main(String[] args) {
        maps();
    }
}
