package j5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class J5Annotations {
    public static void main(String[] args) {
        A b = new B();
        b.foo();
    }
}

class A {
    public void foo() {

    }
}

class B extends A {

    @Bootcamp
    public B() {
    }

    @Bootcamp
    @Override
    public void foo() {
        super.foo();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface Bootcamp {

}
