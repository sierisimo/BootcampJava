package j21;

import java.util.List;
import java.util.Objects;

public class J21 {
    public static void main(String[] args) {
        Person p = new Person();
        Employee p1 = new PersonRec("Sier", 33);

        switch (p1){
            case PersonRec personRec:
                System.out.println("Persona: "+ personRec.name() + ", edad: " + personRec.age());
                break;
            case CodigoFacilitoPerson alumnee:
                System.out.println("Coooool ⌛" + alumnee.name() + " has " + alumnee.courses().size());
                break;
        }
    }
}

// POJO: Plain Old Java Object
final class Person {
    private String name;

    private int age;

    Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

interface Employee {}

record PersonRec(String name, int age) implements Employee {
    public void whatsUp(){

    }
}

record Googler(String employeeNumber, double salary) implements Employee{

}

record CodigoFacilitoPerson(String name, List<String> courses) implements Employee{

}

sealed interface Shape permits Circunference {

}

sealed interface Circunference extends Shape permits Circle {

}

final class Circle implements Circunference{

}